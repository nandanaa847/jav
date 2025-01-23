package com.xworkz.abstractrunner;

import com.xworkz.abstractthings.Oppo;
import com.xworkz.abstractthings.SmartPhone;

public class SmartPhoneRunner {
	
	public static void main (String[] args) {
		
		SmartPhone phone = new Oppo("Oppo", 20000, "black", "8gb", 2023);
		
		System.out.println("Static methods");
		SmartPhone.displaybattery();
		SmartPhone.displaybrightness();
		SmartPhone.switchoff();
		SmartPhone.switchon();
		
		System.out.println("instance methods");
		phone.openwatsapp();
		phone.openchat();
		phone.textwithchinmaye();
		phone.closewatsapp();
		
		System.out.println("abstract methods");
		phone.playmusic();
		phone.playmovie();
		phone.updatephone();
		phone.stopmusic();
		
		phone.displaydetails();
		
	}

}
