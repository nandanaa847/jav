package com.xworkz.project_online.Things;

public class Bag {
	
	private String bagbrand;
	private String color;
	private int price;
	private int noofzips;
	private String size;
	
	public Bag() {
		System.out.println("Default constructor");
	}
	
	public void setBagBrand(String bagbrand) {
		this.bagbrand = bagbrand;
	}
	
	public String getBagBrand() {
		return bagbrand;
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
	
	public void setNoOfZips(int noofzips) {
		this.noofzips = noofzips;
	}
	
	public int getNoOfZips() {
		return noofzips;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	@Override
	public String toString() {
		
		return "BagBrand:"+this.bagbrand+" "+"Color:"+this.color+" "+"Price:"+this.price+" "+"NoOfZips:"+this.noofzips+" "+"Size:"+this.size;
	}
}
