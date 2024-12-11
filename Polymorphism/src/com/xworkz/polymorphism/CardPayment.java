package com.xworkz.polymorphism;

public class CardPayment extends Payment{
	

	
	@Override
	public void pay() {
		System.out.println("paying through card");
	}
	
	@Override
	public void paymentupdates() {
		System.out.println("Payment Done through card");
		
	
	}

}
