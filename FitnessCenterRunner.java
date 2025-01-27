package com.xworkz.validate.runner;

import com.xworkz.validate.dto.FitnessCenterDto;
import com.xworkz.validate.service.FitnessCenterService;
import com.xworkz.validate.service.FitnessCenterServiceImple;

public class FitnessCenterRunner {
	
	public static void main(String[] args) {
		
		FitnessCenterDto fitnesscenterdto = new FitnessCenterDto();
		fitnesscenterdto.setCentreName("Smart Fitness");
		fitnesscenterdto.setFees(500);
		fitnesscenterdto.setLocation("kempegowda circle");
		fitnesscenterdto.setNoofmonths(8);
		fitnesscenterdto.setTrainername("Charan");
		System.out.println(fitnesscenterdto);
		
		FitnessCenterService fitnesscenterservice = new FitnessCenterServiceImple();
		fitnesscenterservice.validateAndSave(fitnesscenterdto);
	}

}
