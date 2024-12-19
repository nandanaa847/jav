package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Flipkart;

public class FlipkartRunner {
	
	public static void main(String[] args) {
		
		Flipkart flipkart = new Flipkart("kurtaset", 2000, 1, "Excellent", "Delivered");
		
		System.out.println(flipkart);
	}

}
