package com.epam.interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.estimation.EstimateCost;

public class Input {
	static float principleAmount;
	static float rateOfInterest;
	static float numberOfperiods;
	
	static int flag = 1;
	Scanner sc = new Scanner(System.in);
	private static final Logger LOGGER = LogManager.getLogger(Input.class);
	
	
	
	public void takeAttributes() {
		// TODO Auto-generated method stub
		
		while(flag == 1) {
			LOGGER.info("Enter the attributes:");
			principleAmount= sc.nextFloat();
			rateOfInterest = sc.nextFloat();
			numberOfperiods = sc.nextFloat();
			LOGGER.info("Enter your choice: 1.Calculate simple interest 2.Calculate compound interest 3.Exit");
			int choice = sc.nextInt();
			calculate(choice);
			
			
		}
		
		
	}

	private void calculate(int choice) {
		// TODO Auto-generated method stub
		switch(choice) {
		case 1:
			SimpleInterest si = new SimpleInterest();
			si.calculateSimpleInterest(principleAmount,rateOfInterest, numberOfperiods);
			break;
		case 2:
			CompoundInterest ci = new CompoundInterest();
			ci.calculateCompoundInterest(principleAmount,rateOfInterest, numberOfperiods);
			break;
		case 3:
			flag = 0;
			break;
		default:
			LOGGER.info("Enter the valid input:");
			break;
		}
		
	}
	

}
