package com.xworkz.project_online.Things;

public class House {
	
	private String housename;
	private int wardnum;
	private int numofrooms;
	private String area;
	private String district;	
	
	public House() {
		System.out.println("Default constructor");
	}
	
	public void setHouseName(String housename) {
		this.housename = housename;
	}
	
	public String getHouseName() {
		return housename;
	}
	
	public void setWardNum(int wardnum) {
		this.wardnum = wardnum;
	}
	
	public int getWardNum() {
		return wardnum;
	}
	
	public void setNumOfRooms(int numofrooms) {
		this.numofrooms = numofrooms;
	}
	
	public int getNumOfRooms() {
		return numofrooms;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getDistrict() {
		return district;
	}
	@Override
	public String toString() {
		
		return "HouseName:"+this.housename+" "+"WardNum:"+this.wardnum+" "+"NumOfRooms:"+this.numofrooms+" "+"Area:"+this.area+" "+"District:"+this.district;
	}
}



