package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.IDCard;

public class IDCardRunner {

	public static void main(String[] args) {
		
		IDCard idcard = new IDCard();
		    idcard.setStudentName("Chinmaye");
			System.out.println(idcard.getStudentName());
			
			idcard.setValidity(2022-2026);
			System.out.println(idcard.getValidity());
			
			idcard.setUSN("1GC22CS020");
			System.out.println(idcard.getUSN());
			
			idcard.setCollegeName("Ghousiya College Of Engineering");
			System.out.println(idcard.getCollegeName());
			
			idcard.setDateOfBirth(22/11/2004);
			System.out.println(idcard.getDateOfBirth());
			
			System.out.println(idcard.toString());
	}
}
