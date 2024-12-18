package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.Watch;

public class WatchRunner {

	
public static void main(String[] args) {
		
	 Watch watch = new Watch();
     watch.setBrand("Casio");
		System.out.println(watch.getBrand());
		
		watch.setTime("16:40");
		System.out.println(watch.getTime());
		
		watch.setColor("Rose Gold");
		System.out.println(watch.getColor());
		
		watch.setPrice(5500);
		System.out.println(watch.getPrice());
		
		watch.setType("Digital");
		System.out.println(watch.getType());
		
		System.out.println(watch.toString());
}
}
