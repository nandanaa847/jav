package com.xworkz.project_online.things;

public class Flipkart {
	
	private String productname;
	private int price;
	private int quantity;
	private String review;
	private String orderstatus;
	
	public Flipkart(String productname , int price , int quantity , String review , String orderstatus) {
		
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		this.review = review;
		this.orderstatus = orderstatus;
	}
	
	@Override
	public String toString() {
		
		return "Productname:"+this.productname+" "+"Price:"+this.price+" "+"Quantity:"+this.quantity+" "+"Review:"+this.review+" "+"Orderstatus:"+this.orderstatus;
	}
	

}
