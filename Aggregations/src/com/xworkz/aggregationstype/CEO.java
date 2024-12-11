package com.xworkz.aggregationstype;

public class CEO {
	
	public String name;
	public int age;
	public int ceoID;
	public Salary salary;
    public Address address;
	
	public CEO(String name , int age , int ceoID , Salary salary , Address address) {
		this.name = name;
		this.age = age;
		this.ceoID = ceoID;
		this.salary = salary;
        this.address = address;
		
	}

}
