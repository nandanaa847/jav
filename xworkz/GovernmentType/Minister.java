package com.xworkz.GovernmentType;

public class Minister {
	
	String name;
	String portfolio;
	String experience;
	
	public Minister(String name , String portfolio , String experience) {
		
		this.name = name;
		this.portfolio = portfolio;
		this.experience = experience;
	}

	public void ministerinformation(){
		
		System.out.println(name);
		System.out.println(portfolio);
		System.out.println(experience);
	}
}
