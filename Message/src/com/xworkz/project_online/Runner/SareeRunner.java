package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.Saree;

public class SareeRunner {
	
public static void main(String[] args) {
		
	    Saree saree = new Saree();
	    saree.setSareeType("Banarasii");
		System.out.println(saree.getSareeType());
		
		saree.setPrice(25000);
		System.out.println(saree.getPrice());
		
		saree.setColor("Red");
		System.out.println(saree.getColor());
		
		saree.setDelieveryAddress("MG Road");
		System.out.println(saree.getDelieveryAddress());
		
		saree.setReview("Excellent");
		System.out.println(saree.getReview());
		
		System.out.println(saree.toString());
	}


}
