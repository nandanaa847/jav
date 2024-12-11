package com.xworkz.aggregations;

import com.xworkz.aggregationstype.CEO;
import com.xworkz.aggregationstype.Employee;
import com.xworkz.aggregationstype.Manager;

public class Company {
	
	CEO ceo;
	Manager manager;
	Employee employee;
	
	public Company(CEO ceo , Manager manager , Employee employee) {
		
		this.ceo = ceo;
		this.manager = manager;
		this.employee = employee;
	}
	
	public void printDetails() {
		
		System.out.println("CEO Details");
		System.out.println(ceo.name);
		System.out.println(ceo.age);
		System.out.println(ceo.ceoID);
		System.out.println(ceo.salary.totalsalary);
		System.out.println(ceo.salary.performance);
		System.out.println(ceo.salary.experience);
		System.out.println(ceo.address.pincode);
		System.out.println(ceo.address.state);
		System.out.println(ceo.address.streetname);
		System.out.println("-----------");
		System.out.println("Manager Details");
		System.out.println(manager.departmentname);
		System.out.println(manager.departmentnum);
		System.out.println(manager.name);
		System.out.println(manager.salary.totalsalary);
		System.out.println(manager.salary.performance);
		System.out.println(manager.salary.experience);
		System.out.println(manager.address.pincode);
		System.out.println(manager.address.state);
		System.out.println(manager.address.streetname);
		System.out.println("-----------");
		System.out.println("Employee Details");
		System.out.println(employee.age);
		System.out.println(employee.employeeID);
		System.out.println(employee.name);
		System.out.println(employee.salary.totalsalary);
		System.out.println(employee.salary.performance);
		System.out.println(employee.salary.experience);
		System.out.println(employee.address.pincode);
		System.out.println(employee.address.state);
		System.out.println(employee.address.streetname);
	}

}
