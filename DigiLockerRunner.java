package com.xworkz.validate.runner;

import com.xworkz.validate.dto.DigiLockerDto;
import com.xworkz.validate.service.DigiLockerService;
import com.xworkz.validate.service.DigiLockerServiceImple;

public class DigiLockerRunner {
	
public static void main(String[] args) {
	
	DigiLockerDto digilockerdto = new DigiLockerDto();
	
	digilockerdto.setDocID(1342);
	digilockerdto.setDocname("thiss");
	digilockerdto.setDoctype("pdff");
	digilockerdto.setLockerID(1234);
	digilockerdto.setLockername("npch");
	digilockerdto.setLockerstatus("locked");
	digilockerdto.setPassword("chpona");
	digilockerdto.setPasswordcapacity(10);
	digilockerdto.setUserID(4567);
	digilockerdto.setUsername("chinmaye");
	
	System.out.println(digilockerdto);
	
	DigiLockerService digilockerservice = new DigiLockerServiceImple(); 
	digilockerservice.validateAnddSave(digilockerdto);
	}

}
