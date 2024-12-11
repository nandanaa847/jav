package com.xworkz.polymorphism;

public class PolymorphismRunner {
	
	public static void main(String[] args) {
		
		CashPayment cashpayment = new CashPayment();
		
		cashpayment.pay();
		cashpayment.paymentupdates();
		
		
		System.out.println("---------");
		
        CardPayment cardpayment = new CardPayment();
		
		cardpayment.pay();
		cardpayment.paymentupdates();
		
		
		System.out.println("---------");
		
        UPIPayment upipayment = new UPIPayment();
		
        upipayment.pay();
        upipayment.paymentupdates();
        
        
        
		
		
	}

}
