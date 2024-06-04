package org.gemoc.agro.scientific;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.Month;
import org.gemoc.agro.exploitation.Exploitation;
import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class WaterAnalysis {

	public void compute(ExploitationAnalysis analysis) {
		if (analysis.getSchedule() != null
				&& analysis.getSchedule().getExploitation() != null
				&& analysis.getBiomassModels().size() > 0) {
			Exploitation exp = analysis.getSchedule().getExploitation();
			Map<Culture, BiomassModel> activityToModel = Maps
					.newLinkedHashMap();
			Map<Culture, ExploitationActivity> activityPlanting = Maps
					.newLinkedHashMap();
			Map<Culture, ExploitationActivity> activityHarvest = Maps
					.newLinkedHashMap();
			for (BiomassModel bioModel : analysis.getBiomassModels()) {
				if (bioModel.getCulture() != null
						&& bioModel.getCulture().getActivities().size() > 0) {

					for (ExploitationActivity activity : bioModel.getCulture()
							.getActivities()) {
						if (activity.getName().equals("SOW")) {
							activityPlanting.put(bioModel.getCulture(),
									activity);
						}
						if (activity.getName().equals("HARVEST")) {
							activityHarvest
									.put(bioModel.getCulture(), activity);
						}
					}
					activityToModel.put(bioModel.getCulture(), bioModel);
				}
			}

			analysis.getSurfaceDatas().clear();
			for (Surface s : exp.getSurfaces()) {
				if (s.getDedicatedto() != null) {
					for (Culture culture : s.getDedicatedto().getCultures()) {
						ExploitationActivity plantingActivity = activityPlanting
								.get(culture);

						ExploitationActivity harvestingActivity = activityHarvest
								.get(culture);
						Day plantingDay = null;
						Day harvestingDay = null;
						if (plantingActivity != null
								&& harvestingActivity != null) {
							for (ActivityWork work : analysis.getSchedule()
									.getWorkToDo()) {
								if (work.getActivity() == plantingActivity
										&& work.getOnSurface() == s) {
									plantingDay = work.getScheduledOn();
								}
								if (work.getActivity() == harvestingActivity
										&& work.getOnSurface() == s) {
									harvestingDay = work.getScheduledOn();
								}
							}
						}
						if (plantingDay != null && harvestingDay != null) {
							SurfaceData previousData = null;
							Day currentDay = plantingDay;
							BiomassModel bioModel = null;
							for (BiomassModel model : analysis
									.getBiomassModels()) {
								if (model.getCulture() == culture) {
									bioModel = model;
								}
							}

							Map<Day, SurfaceData> dayToData = Maps
									.newLinkedHashMap();

							while (currentDay != null
									&& currentDay != harvestingDay) {
								SurfaceData data = ScientificFactory.eINSTANCE
										.createSurfaceData();
								data.setSurface(s);
								data.setDay(currentDay);
								dayToData.put(currentDay, data);
								analysis.getSurfaceDatas().add(data);
								if (bioModel != null) {
									double hydroDeficit = 0;
									Collection<Day> previousDays = getPreviousDays(
											analysis.getSchedule(), currentDay,
											analysis.getKDaysToConsider());
									for (Day pastDay : previousDays) {
										double evaporation = getDailyEvaporation(pastDay);
										double addedWater = pastDay.getRain();										
										SurfaceData previousDayData = dayToData
												.get(pastDay);
										if (previousDayData != null) {
											addedWater += previousDayData
													.getExtraWater();
										}
										hydroDeficit += (evaporation - addedWater);
									}
									data.setHydroDeficit(hydroDeficit);

									if (hydroDeficit >= analysis
											.getLimitBeforeWatering()) {
										/*
										 * total is the size of the surface in
										 * ares (which equals 100m*m)
										 */
										data.setExtraWater(40d);
									}
									if (previousData != null) {
										/*
										 * compute the biomass growth
										 */
										data.setBiomass(new BigDecimal(
												Calculator
														.calculateBiomass(
																biomassVal(previousData),
																currentDay,
																bioModel)));
										data.setLAI(new BigDecimal(Calculator
												.calculateLAI(currentDay,
														laiVal(previousData),
														bioModel)));
									}
								}
								currentDay = getNextDay(analysis.getSchedule(),
										currentDay);
								previousData = data;
							}
						}

					}
				}
			}

		}
	}

	private double laiVal(SurfaceData previousData) {
		if (previousData.getLAI() != null)
			return previousData.getLAI().doubleValue();
		return 0.0d;
	}

	private double biomassVal(SurfaceData previousData) {
		if (previousData.getBiomass() != null) {
			return previousData.getBiomass().doubleValue();
		}
		return 0.0d;
	}

	private ImmutableMap<Month, Double> dailyEvaporation = ImmutableMap
			.<Month, Double> builder()
			.put(Month.JAN, Double.valueOf(0.82 / 12))
			.put(Month.FEB, Double.valueOf(0.83 / 12))
			.put(Month.MAR, Double.valueOf(1.02 / 12))
			.put(Month.APR, Double.valueOf(1.12 / 12))
			.put(Month.MAY, Double.valueOf(1.26 / 12))
			.put(Month.JUN, Double.valueOf(1.27 / 12))
			.put(Month.JUL, Double.valueOf(1.28 / 12))
			.put(Month.AUG, Double.valueOf(1.19 / 12))
			.put(Month.SEPT, Double.valueOf(1.04 / 12))
			.put(Month.OCT, Double.valueOf(0.95 / 12))
			.put(Month.NOV, Double.valueOf(0.82 / 12))
			.put(Month.DEC, Double.valueOf(0.79 / 12)).build();

	private double getDailyEvaporation(Day pastDay) {
		return 4.5d;
//		return 3.9999999999999d;
		// retun dailyEvaporation.get(pastDay.getMonth());
	}

	private Collection<Day> getPreviousDays(Schedule s, Day start, int n) {
		Set<Day> previousDays = Sets.newLinkedHashSet();
		Day cur = getPreviousDay(s, start);
		for (int i = 0; i < n; i++) {
			if (cur != null) {
				previousDays.add(cur);
			}
			cur = getPreviousDay(s, cur);
		}
		return previousDays;
	}

	private Day getNextDay(Schedule schedule, Day cur) {
		int index = schedule.getClimateData().getDays().indexOf(cur);
		if (index < 0) {
			return null;
		}
		index++;
		if (index >= schedule.getClimateData().getDays().size()) {
			return null;
		}
		return schedule.getClimateData().getDays().get(index);
	}

	private Day getPreviousDay(Schedule schedule, Day cur) {
		int index = schedule.getClimateData().getDays().indexOf(cur);
		index--;
		if (index < 0) {
			return null;
		}
		if (index >= schedule.getClimateData().getDays().size()) {
			return null;
		}
		return schedule.getClimateData().getDays().get(index);
	}
}
