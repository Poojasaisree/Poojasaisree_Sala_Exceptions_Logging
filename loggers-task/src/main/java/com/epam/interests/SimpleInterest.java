package com.epam.interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);

	public void calculateSimpleInterest(float principleAmount, float rateOfInterest, float numberOfperiods) {
		// TODO Auto-generated method stub
		
		LOGGER.info((principleAmount*rateOfInterest*numberOfperiods)/100);
		
	}

}
