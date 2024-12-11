package com.xworkz.aggregationstype;

public class Manager {
	
	
	public String departmentname;
	public int departmentnum;
	public String name;
	public Salary salary;
	public Address address;
	
	public Manager(String departmentname , int departmentnum , String name , Salary salary , Address address) {
		
		this.departmentname = departmentname;
		this.departmentnum = departmentnum;
		this.name = name;
		this.salary = salary;
        this.address = address;
	}

}
