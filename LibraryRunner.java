package com.xworkz.validate.runner;

import com.xworkz.validate.dto.LibraryDto;
import com.xworkz.validate.service.LibraryService;
import com.xworkz.validate.service.LibraryServiceImple;

public class LibraryRunner {
	
public static void main(String[] args) {
	
	LibraryDto librarydto = new LibraryDto();
	
	librarydto.setBookauthor("ben horowitz");
	librarydto.setBookID(1190);
	librarydto.setBookname("hard things about hard things");
	librarydto.setBookprice(400);
	librarydto.setGenre("self help book");
	librarydto.setLibraryadress("ramanagara");
	librarydto.setLibraryname("ghoijk");
	librarydto.setTotalbooks(800);
	
	System.out.println(librarydto);
	
	LibraryService libraryservice = new LibraryServiceImple();
	libraryservice.validateAnddSave(librarydto);
	}


}
