package com.xworkz.project_online.Runner;

import com.xworkz.project_online.things.Inshot;
import com.xworkz.project_online.things.Ludo;
import com.xworkz.project_online.things.Phonepe;
import com.xworkz.project_online.things.Watsapp;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		Watsapp watsapp = new Watsapp("Watsapp", "messaging", 4.7f, "send imp images", "Good", "Jan koum and brian acton", 2009,"US", "Terms", 197, "2.9billion");
		
		Inshot inshot = new Inshot("Inshot", "Editing photos and videos ", 4.7f, "good quality pictures", "Excellent", "Jan koum and brian acton", 2009,"US", "Terms", 197, "2.9billion");
		
		Ludo ludo = new Ludo("ludo", "Editing photos and videos ", 4.7f, "good quality pictures", "Excellent", "Jan koum and brian acton", 2009,"US", "Terms", 197, "2.9billion");
		
		Phonepe phonepe = new Phonepe("Phonepe", "Editing photos and videos ", 4.7f, "good quality pictures", "Excellent", "Jan koum and brian acton", 2009,"US", "Terms", 197, "2.9billion");
		
		System.out.println(watsapp);
		System.out.println(inshot);
		System.out.println(ludo);
		System.out.println(phonepe);
	}
}
