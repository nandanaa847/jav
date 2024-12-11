package com.xworkz.aggregations;

import com.xworkz.aggregationstype.Address;
import com.xworkz.aggregationstype.CEO;
import com.xworkz.aggregationstype.Employee;
import com.xworkz.aggregationstype.Manager;
import com.xworkz.aggregationstype.Salary;

public class AggregationRunner {
	
	public static void main(String[] args) {
		System.out.println("Company 1");
		 Salary salary = new Salary(1250000 , "Excellent" , "22years");
	        Address address = new Address(562159 , "Karnataka" , "Manjunathnagar");
		CEO ceo = new CEO("Poorna" , 52, 505 , salary, address); 
		
		Salary salary1 = new Salary(100000, "good", "7years");
        Address address1 = new Address(560066, "Karnataka" , "Whitefield");
		Manager manager = new Manager("Marketing" , 105, "Chinmaye", salary1 , address1);
		
		Salary salary2 = new Salary(40000, "Superb" , "2years");
		Address address2 = new Address(600032, "Tamilnadu", "Guindy");
		Employee employee = new Employee(24 , 6754 , "Nandana" , salary2 , address2);
		
		Company company = new Company(ceo , manager , employee);
		
		company.printDetails();
		System.out.println("-----------");
System.out.println("Company 2");
        
Salary salary3 = new Salary(1300000, "Outstanding", "20years");
Address address3 = new Address(500001, "Telangana" , "Hyderabadcentral");
        CEO ceo1 = new CEO("Varshitha", 53, 605 , salary3, address3);

        Salary salary4 = new Salary(500000, "Amazing", "6years");
        Address address4 = new Address(571401, "Karnataka", "KRRoad");
        Manager manager1 = new Manager("Creative and Design" , 405 ,"Vedika" , salary4, address4);

        Salary salary5 = new Salary(50000, "Great", "3years");
        Address address5 = new Address(400005, "Maharashthra", "Colaba");
        Employee employee1 = new Employee(24, 404, "Neethu", salary5, address5);

        Company company1 = new Company(ceo1 , manager1 , employee1);
        company1.printDetails();
		
		
		
	}

}
