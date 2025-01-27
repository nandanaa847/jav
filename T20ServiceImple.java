package com.xworkz.validate.service;

import com.xworkz.validate.dto.T20Dto;

public class T20ServiceImple extends T20Service{

	@Override
	public String validateAnddSave(T20Dto dto) {
		
		 System.out.println(dto);
		    
		    if(dto!=null) {
		    	if( dto.getCaptainname()!=null
		    			&& dto.getCountry()!=null
		    			&& dto.getMatchvenue()!=null
		    			&& dto.getTicketprice()>120
		    			&& dto.getTotalaudience()>3000
		    			&& dto.getTotalovers()>19
		    			&& dto.getWinner()!=null) {
		    	 if(dto.getCaptainname().length()>3
		    			 && dto.getCountry().length()>3
		    			 && dto.getMatchvenue().length()>3
		    			 && dto.getWinner().length()>3) {
		    		 System.out.println("validated and can be saved");
		    		 return "saved";
		    	 }else {
		    		 System.out.println("check matchvenue , country , captainname and winner");
		    	 }
		    }else {
		    	System.out.println("check everything");
		    }
	     }
		return "not saved";
	}
	

}
