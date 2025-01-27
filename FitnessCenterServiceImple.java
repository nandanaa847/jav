package com.xworkz.validate.service;

import com.xworkz.validate.dto.FitnessCenterDto;

public class FitnessCenterServiceImple extends FitnessCenterService{

	@Override
	public String validateAndSave(FitnessCenterDto fitdto) {
		
		 System.out.println(fitdto);
		    
		    if(fitdto!=null) {
		    	if(fitdto.getCentreName()!=null && fitdto.getLocation()!=null && fitdto.getFees()>10 && fitdto.getNoofmonths()>4
		    			&& fitdto.getTrainername()!=null) {
		    	 if(fitdto.getCentreName().length()>3
		    			 && fitdto.getLocation().length()>3
		    			 && fitdto.getTrainername().length()>3) {
		    		 System.out.println("validated and can be saved");
		    		 return "saved";
		    	 }else {
		    		 System.out.println("check centername , trainername and location");
		    	 }
		    }else {
		    	System.out.println("check everything");
		    }
	     }
		
		return "not saved";
	}
	
	

}
