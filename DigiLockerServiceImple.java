package com.xworkz.validate.service;

import com.xworkz.validate.dto.DigiLockerDto;

public class DigiLockerServiceImple extends DigiLockerService{

	@Override
	public String validateAnddSave(DigiLockerDto digidto) {
		
		 System.out.println(digidto);
		    
		    if(digidto!=null) {
		    	if( digidto.getDocID()>3
		    			&& digidto.getDocname()!=null
		    			&& digidto.getDoctype()!=null
		    			&& digidto.getLockerID()>3
		    			&& digidto.getLockername()!=null
		    			&& digidto.getLockerstatus()!=null
		    			&& digidto.getPassword()!=null
		    			&& digidto.getPasswordcapacity()>3
		    			&& digidto.getUserID()>3
		    			&& digidto.getUsername()!=null) {
		    	 if(digidto.getDocname().length()>3
		    			 && digidto.getDoctype().length()>3
		    			 && digidto.getLockername().length()>3
		    			 && digidto.getLockerstatus().length()>3
		    			 && digidto.getPassword().length()>3
		    			 && digidto.getUsername().length()>3) {
		    		 System.out.println("validated and can be saved");
		    		 return "saved";
		    	 }else {
		    		 System.out.println("check Docname , lockername ,Lockerstatus, Password , Doctype and username");
		    	 }
		    }else {
		    	System.out.println("check everything");
		    }
	     }
		
		return "not saved";
	}

}
