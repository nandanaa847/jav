package com.xworkz.validate.service;

import com.xworkz.validate.dto.LibraryDto;


public class LibraryServiceImple extends LibraryService{

	
	@Override
		public String validateAnddSave(LibraryDto dto) {
		
	      System.out.println(dto);
		    
		    if(dto!=null) {
		    	if(dto.getBookID()>2 
		    			&& dto.getBookauthor()!=null
		    			&& dto.getBookname()!=null
		    			&& dto.getBookprice()>200
		    			&& dto.getGenre()!=null
		    			&& dto.getLibraryadress()!=null
		    			&& dto.getLibraryname()!=null
		    			&& dto.getTotalbooks()>200) {
		    	 if(dto.getBookauthor().length()>3
		    			 && dto.getBookname().length()>3
		    			 && dto.getGenre().length()>3
		    			 && dto.getLibraryadress().length()>3
		    			 && dto.getLibraryname().length()>3) {
		    		 System.out.println("validated and can be saved");
		    		 return "saved";
		    	 }else {
		    		 System.out.println("check libraryname , libraryadress , bookname , bookauthor and genre");
		    	 }
		    }else {
		    	System.out.println("check everything");
		    }
	     }
			return null;
		}
}

	
	
