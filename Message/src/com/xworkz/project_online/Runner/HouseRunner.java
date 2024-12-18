package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.House;

public class HouseRunner {

public static void main(String[] args) {
		
	    House house = new House();
		house.setHouseName("Lakshmi Nivasa");
		System.out.println(house.getHouseName());
		
		house.setWardNum(25);
		System.out.println(house.getWardNum());
		
		house.setNumOfRooms(2);
		System.out.println(house.getNumOfRooms());
		
		house.setArea("Manjunath Nagara");
		System.out.println(house.getArea());
		
		house.setDistrict("Ramanagara");
		System.out.println(house.getDistrict());
		
		System.out.println(house.toString());
	}

}
