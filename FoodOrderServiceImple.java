package com.xworkz.foodorder.service;

import com.xworkz.order.dto.FoodOrderDto;

public class FoodOrderServiceImple extends FoodOrderService{

	@Override
	public String validateAndSave(FoodOrderDto dto) {
	    System.out.println(dto);
	    
	    if(dto!=null) {
	    	if(dto.getOrdernum()>0 && dto.getCustomername()!=null && dto.getCustomercontactnum()>=900000000 && dto.getFoodname()!=null && dto.getTypeoffood()!=null) {
	    	 if(dto.getCustomername().length()>3 && dto.getFoodname().length()>3 && dto.getTypeoffood().length()>3) {
	    		 System.out.println("validated and can be saved");
	    		 return "saved";
	    	 }else {
	    		 System.out.println("check customername , foodname and typeoffood");
	    	 }
	    }else {
	    	System.out.println("check everything");
	    }
     }
		return "not saved";
	}

}
