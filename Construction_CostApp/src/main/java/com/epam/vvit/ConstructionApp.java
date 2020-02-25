package com.epam.vvit;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConstructionApp{	
	static final Logger logger = LogManager.getLogger(ConstructionApp.class); 
	static Scanner scan;
	public static double areaofHouse;
	public static int materialStandard;
	public static char automated;
	
	public ConstructionApp(){
		scan = new Scanner(System.in);
		try {
			logger.info("House constuction material standards");
			logger.warn("Enter the area of house(in square ft.):");
			areaofHouse = scan.nextDouble();
			
			logger.info("\nChoose material type\n1.Standard material\n2.Above standard material\n3.High standard material");
			materialStandard = scan.nextInt();
			if(materialStandard==3) {
				logger.info("Need fully automated home(y/n)");
				automated = scan.next().charAt(0);
			}
		}
		catch(InputMismatchException e) {
		}
		
		
	}
	
	public static void Calculate_Cost() {
		Construction_Cost cost_obj = new Construction_Cost();
		double k = cost_obj.cal_cost(materialStandard, areaofHouse, automated);
		if(k!=0) {
			logger.info(String.valueOf(k)+"\\-");
		}
		else {
			logger.error("Not a valid input..try again!!");
		}
		
	}
	
    public static void main( String[] args )
    {	
       	new ConstructionApp();
    	Calculate_Cost();
    	
    }
}
