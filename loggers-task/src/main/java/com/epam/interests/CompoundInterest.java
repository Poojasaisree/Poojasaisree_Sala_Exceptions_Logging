package com.epam.interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.estimation.EstimateCost;

public class CompoundInterest {
	private static final Logger LOGGER = LogManager.getLogger(EstimateCost.class);

	public void calculateCompoundInterest(float principleAmount, float rateOfInterest, float numberOfPeriods) {
		// TODO Auto-generated method stub
		rateOfInterest = rateOfInterest/100;
		
		double compoundAmount = principleAmount*Math.pow((1+rateOfInterest), numberOfPeriods);

		LOGGER.info(compoundAmount-principleAmount);
	}

}
