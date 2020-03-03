package com.epam.estimation;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EstimateCost {
	private static final Logger LOGGER = LogManager.getLogger(EstimateCost.class);

	
	public void houseCost(float area, int costPerSquareFeet) {
		// TODO Auto-generated method stub
		LOGGER.info("Estimated cost:" + area*costPerSquareFeet + "INR");
		
	}

	

}
