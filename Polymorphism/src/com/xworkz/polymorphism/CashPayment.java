package com.xworkz.polymorphism;

public class CashPayment extends Payment{
	
	
	@Override
	public void pay() {
		System.out.println("paying through cash");
	}
	
	@Override
	public void paymentupdates() {
		System.out.println("Payment Done through cash");
	}

}
