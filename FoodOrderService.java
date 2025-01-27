package com.xworkz.foodorder.service;

import com.xworkz.order.dto.FoodOrderDto;

public abstract class FoodOrderService {
	
	public abstract String validateAndSave(FoodOrderDto dto);

}
