package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.Bag;

public class BagRunner {
	
	public static void main(String[] args) {
		
		Bag bag = new Bag();
		bag.setBagBrand("nike");
		System.out.println(bag.getBagBrand());
		
		bag.setColor("Black");
		System.out.println(bag.getColor());
		
		bag.setPrice(2000);
		System.out.println(bag.getPrice());
		
		bag.setNoOfZips(3);
		System.out.println(bag.getNoOfZips());
		
		bag.setSize("Medium");
		System.out.println(bag.getSize());
		
		System.out.println(bag.toString());
	}

}
