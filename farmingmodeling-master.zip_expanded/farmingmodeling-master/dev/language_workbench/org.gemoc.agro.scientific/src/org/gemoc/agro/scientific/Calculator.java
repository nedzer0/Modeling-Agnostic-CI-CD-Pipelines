package org.gemoc.agro.scientific;
import org.gemoc.agro.simulation.Day;

public class Calculator {	

	
	/**
	 * CALCUL DE L'INDEX de la SURFACE FOLIAIRE
	 */
	public static double calculateLAI(Day dday, double STeveValue, double LMax, double A, double Ti, double B){
		double e1 = 1/(Math.exp(-A*(calculateSt(STeveValue,dday)-Ti))+1);
		double e2 = Math.exp(B*(calculateSt(STeveValue,dday)-calculateTr(A, B, Ti)));
		return LMax*(e1-e2);
	}
	
	public static double calculateLAI(Day dday,double STeveValue, BiomassModel culture){
		return calculateLAI(dday, STeveValue, culture.getLmax(), culture.getA(), culture.getTI(), culture.getB());
	}
	
	/**
	 * CALCUL DE LA BIOMASS
	 */	
	public static double calculateBiomass(double eveValue, Day dday, double eB, double eImax, double K, double LAI){
		/*
		 * this divide is here to change unit and avoid double overflow.
		 */
		double PAR = dday.getRay() / 100;
		return eveValue+(eImax*(1-Math.exp(-K*LAI))*eB*PAR);
	}
	
	public static double calculateBiomass(double eveValue, Day dday, BiomassModel culture){
		return calculateBiomass(eveValue, dday, culture.getEb(),culture.getEimax(),culture.getK(),calculateLAI(dday,eveValue, culture));
	}
	
	/**
	 * CALCUL INTERMEDIAIRE
	 */
	public static double calculateTr(double A, double B, double Ti){
		return (1/B)*Math.log(1+Math.exp(A*Ti));
	}
	
	public static double calculateTr(BiomassModel culture){
		return calculateTr(culture.getA(),culture.getB(),culture.getTI());
	}
	
	
	public static double calculateSt(double eveValue,Day dday){
		return eveValue+dday.getTemperature(); 
	}
	
	
}