package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Optical;

public class OpticalRunner {
	
	public static void main(String[] args) {
		
		Optical optical = new Optical("3.5mm", "22mm", "7.8mm", 1.5f, "180 degrees");
		System.out.println(optical);
	}

}
