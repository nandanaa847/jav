package com.xworkz.validate.runner;

import com.xworkz.validate.dto.T20Dto;
import com.xworkz.validate.service.T20Service;
import com.xworkz.validate.service.T20ServiceImple;

public class T20Runner {
	
public static void main(String[] args) {
	
	T20Dto t20dto = new T20Dto();
	
	t20dto.setCaptainname("virat kohli");
	t20dto.setCountry("India vs Australia");
	t20dto.setMatchvenue("chinnaswamy stadium");
	t20dto.setTicketprice(3000);
	t20dto.setTotalaudience(40000);
	t20dto.setTotalovers(20);
	t20dto.setWinner("India");
	
	System.out.println(t20dto);
	
	T20Service t20service = new T20ServiceImple();
	t20service.validateAnddSave(t20dto);
	}

}
