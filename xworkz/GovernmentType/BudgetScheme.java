package com.xworkz.GovernmentType;

public class BudgetScheme {
	
	String department;
	long amount;
	String budgetname;
	
	public BudgetScheme(String department , long amount , String budgetname) {
		
		this.department = department;
		this.amount = amount;
		this.budgetname = budgetname;
	}
	
public void budgetschemeinformation(){
		
		System.out.println(department);
		System.out.println(amount);
		System.out.println(budgetname);

}

}
