package com.epam.vvit;

public class InterestCalculation {
	public static double simpleInterest(double principalAmount,double timePeriod,double rateOfInterest) {
		return (principalAmount*timePeriod*rateOfInterest)/100;
	}
	public static double compoundInterest(double principalAmount,double timePeriod,double rateOfInterest) {
		rateOfInterest = 1+(rateOfInterest)/100;
		rateOfInterest=Math.pow(rateOfInterest,timePeriod);
	    double amount=principalAmount*rateOfInterest;
	    double total =amount-principalAmount;
		return total;
	}
}
