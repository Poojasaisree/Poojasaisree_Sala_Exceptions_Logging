package com.epam.estimation;

import java.io.FileDescriptor;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TakeRequirements {
	static float area;
	static int flag = 1;

	private static final Logger LOGGER = LogManager.getLogger(TakeRequirements.class);

	public static void inputRequirements() {
		Scanner sc = new Scanner(System.in);
		while(flag == 1) {
			LOGGER.info("Enter the total area of the house:");
			area = sc.nextFloat();
			LOGGER.info("Choose the material standard: 1.Standard Materials 2.Above standard materials 3.High standard material 4.High standard and fully automated house 5.Exit ");
			int choice = sc.nextInt();
			estimate(choice);
		}


	}

	public static void estimate(int choice) {
		// TODO Auto-generated method stub
		EstimateCost cost = new EstimateCost();
		int costPerSquareFeet;
		switch(choice) {
		case 1:
			costPerSquareFeet = 1200;
			cost.houseCost(area,costPerSquareFeet);
			break;
		case 2:
			costPerSquareFeet = 1500;
			cost.houseCost(area,costPerSquareFeet);
			break;
		case 3:
			costPerSquareFeet = 1800;
			cost.houseCost(area,costPerSquareFeet);	
			break;
		case 4:
			costPerSquareFeet = 2500;
			cost.houseCost(area,costPerSquareFeet);
			break;
		case 5:
			flag = 0;
			break;
		default:
			LOGGER.info("Enter the valid input");
			break;
		}

	}

}
