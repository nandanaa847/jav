package com.xworkz.order.dto;

import java.util.Objects;

public class FoodOrderDto {
	
	private int ordernum;
	private String customername;
	private long customercontactnum;
	private String foodname;
	private String typeoffood;
	
	public FoodOrderDto() {
		
	}

	public FoodOrderDto(int ordernum, String customername, long customercontactnum, String foodname, String typeoffood) {
		super();
		this.ordernum = ordernum;
		this.customername = customername;
		this.customercontactnum = customercontactnum;
		this.foodname = foodname;
		this.typeoffood = typeoffood;
	}

	public int getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public long getCustomercontactnum() {
		return customercontactnum;
	}

	public void setCustomercontactnum(long customercontactnum) {
		this.customercontactnum = customercontactnum;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getTypeoffood() {
		return typeoffood;
	}

	public void setTypeoffood(String typeoffood) {
		this.typeoffood = typeoffood;
	}

	@Override
	public String toString() {
		return "FoodOrderdto [ordernum=" + ordernum + ", customername=" + customername + ", customercontactnum="
				+ customercontactnum + ", foodname=" + foodname + ", typeoffood=" + typeoffood + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customercontactnum, customername, foodname, ordernum, typeoffood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodOrderDto other = (FoodOrderDto) obj;
		return customercontactnum == other.customercontactnum && Objects.equals(customername, other.customername)
				&& Objects.equals(foodname, other.foodname) && ordernum == other.ordernum
				&& Objects.equals(typeoffood, other.typeoffood);
	}
	
	

}
