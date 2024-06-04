package org.gemoc.agro.simulation.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.Month;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;
import org.gemoc.agro.simulation.SimulationFactory;
import org.gemoc.agro.simulation.SimulationPackage;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class ImportCSV {

	@Test
	public void test() throws IOException {

		ResourceSet set = new ResourceSetImpl();

		set.getPackageRegistry().put(SimulationPackage.eINSTANCE.getNsURI(),
				SimulationPackage.eINSTANCE);
		set.getPackageRegistry().put(ActivitiesDSLPackage.eINSTANCE.getNsURI(),
				ActivitiesDSLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put("simulation", new XMIResourceFactoryImpl());

		List<String> lines = com.google.common.io.Files
				.readLines(
						new File(
								"/home/cedric/src/farmingmodeling/materials/farmManagement_2_INRA_STATION_31035002.csv"),
						Charsets.US_ASCII);
		ClimateData climate = SimulationFactory.eINSTANCE.createClimateData();
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			if (i >= 12) {
				Day day = SimulationFactory.eINSTANCE.createDay();
				List<String> fields = Lists.newArrayList(Splitter.on(';')
						.split(line));
				day.setDay(Integer.valueOf(fields.get(3)));
				day.setMonth(Month.get(Integer.valueOf(fields.get(2)) - 1));
				day.setRain(Float.valueOf(fields.get(5)));
				day.setTemperature(Float.valueOf(fields.get(6)));
				day.setRay(Float.valueOf(fields.get(7)));
				climate.getDays().add(day);
			}
		}

		Resource result = set
				.createResource(URI
						.createFileURI("/home/cedric/spaces/farming/modeling-cow/cow/csv.simulation"));
		result.getContents().add(climate);
		result.save(Collections.EMPTY_MAP);
	}
}
