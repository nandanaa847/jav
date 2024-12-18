package com.xworkz.project_online.Things;

public class Watch {
	
	private String brand;
	private String time;
	private String color;
	private int price;
	private String type;
	
	public Watch() {
		System.out.println("Default constructor");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		
		return "Brand:"+this.brand+" "+"Time:"+this.time+" "+"Color:"+this.color+" "+"Price:"+this.price+" "+"Type:"+this.type;
	}
}


