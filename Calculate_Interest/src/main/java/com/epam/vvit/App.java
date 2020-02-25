package com.epam.vvit;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App  {	
	static final Logger logger = LogManager.getLogger(App.class);
	static Scanner scan = new Scanner(System.in);
	static int choice;
	public static double principalAmount=0;
	public static double rateOfInterest;
	public static double timePeriod;
	public App() {
		logger.info("----Interest Calculation----");
		try {
			logger.info("Enter principle amount:");
		 	principalAmount=scan.nextDouble();
		 
		 	logger.warn("Enter Interest rate(in %):");
		 	rateOfInterest=scan.nextDouble();
		 
			logger.warn("Enter period of time(in years):");
		 	timePeriod=scan.nextDouble();
		 	
		 	logger.info("\nChoose the type of interest\n1.SimpleInterest\n2.CompoundInterest");
		 	choice = scan.nextInt();
		
		}
		catch(InputMismatchException e) {
			logger.error("Error!! Try again with numeric..");
		}
		
	}
	
	public static void calculateInterest(int choice) {
		InterestCalculation int_cal = new InterestCalculation();
		if(choice==1) {
			logger.info("Simple Interest:"+int_cal.simpleInterest(principalAmount, timePeriod, rateOfInterest));
		}
		else if(choice==2) {
			logger.info("Compound Interest:"+int_cal.compoundInterest(principalAmount, timePeriod, rateOfInterest));
		}
		
	}
	
    public static void main( String[] args )
    {
    	
    	new App();
    	calculateInterest(choice);
       
    }
}
