package com.xworkz.foodorder.runner;


import com.xworkz.foodorder.service.FoodOrderService;
import com.xworkz.foodorder.service.FoodOrderServiceImple;
import com.xworkz.order.dto.FoodOrderDto;

public class FoodOrderRunner {
	
	public static void main(String[] args) {
		
		FoodOrderDto foodorderdto = new FoodOrderDto();
		foodorderdto.setOrdernum(123);
		foodorderdto.setCustomername("nandana");
		foodorderdto.setCustomercontactnum(933677282L);
		foodorderdto.setFoodname("Chicken Biryani");
		foodorderdto.setTypeoffood("non veg");
		System.out.println(foodorderdto);
		
		
		FoodOrderService service = new FoodOrderServiceImple();
		service.validateAndSave(foodorderdto);
	}

}
