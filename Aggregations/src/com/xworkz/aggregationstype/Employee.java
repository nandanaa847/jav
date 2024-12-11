package com.xworkz.aggregationstype;

public class Employee {
	
	public int age;
	public int employeeID;
	public String name;
	public Salary salary;
	public Address address;
	
	public Employee(int age , int employeeID , String name , Salary salary ,  Address address) {
		
		this.age = age;
		this.employeeID = employeeID;
		this.name = name;
		 this.salary = salary;
	        this.address = address;
	}

}
