package com.xworkz.project_online.Things;

public class Saree {

	private String sareetype;
	private int price;
	private String color;
	private String delieveryaddress;
	private String review;
	
	public Saree() {
		System.out.println("Default constructor");
	}
	
	public void setSareeType(String sareetype) {
		this.sareetype = sareetype;
	}
	
	public String getSareeType() {
		return sareetype;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setDelieveryAddress(String delieveryaddress) {
		this.delieveryaddress = delieveryaddress;
	}
	
	public String getDelieveryAddress() {
		return delieveryaddress;
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	
	public String getReview() {
		return review;
	}
	@Override
	public String toString() {
		
		return "SareeType:"+this.sareetype+" "+"Price:"+this.price+" "+"Color:"+this.color+" "+"DelieveryAddress:"+this.delieveryaddress+" "+"Review:"+this.review;
	}
}


