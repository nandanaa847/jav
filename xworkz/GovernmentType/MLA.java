package com.xworkz.GovernmentType;

public class MLA {
	
	String constituency;
	int age;
	String name;
	
	public MLA(String constituency , int age , String name) {
		
		this.constituency = constituency;
		this.age = age;
		this.name = name;
	}

public void MLAinformation(){
		
		System.out.println(constituency);
		System.out.println(age);
		System.out.println(name);
	}
}
