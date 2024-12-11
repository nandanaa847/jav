package com.xworkz.polymorphism;

public class UPIPayment extends Payment{
	
	
	@Override
	public void pay() {
		System.out.println("paying through UPI");
	}
	
	@Override
	public void paymentupdates() {
		System.out.println("Payment Done through phonepay");
	}
	
	

}
