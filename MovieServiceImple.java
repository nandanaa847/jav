package com.xworkz.validate.service;

import com.xworkz.validate.dto.MovieDto;

public class MovieServiceImple extends MovieService{

	@Override
	public String validateAnddSave(MovieDto moviedto) {
		
      System.out.println(moviedto);
	    
	    if(moviedto!=null) {
	    	if(moviedto.getMoviename()!=null
	    			&& moviedto.getDuration()>120
	    			&& moviedto.getActorage()>30
	    		    && moviedto.getActressname()!=null
	    			&& moviedto.getBudget()>20002020
	    			&& moviedto.getDirectorname()!=null
	    			&& moviedto.getGenre()!=null
	    			&& moviedto.getLanguage()!=null
	    			&& moviedto.getProducername()!=null
	    			&& moviedto.getRating()>5.5f
	    			&& moviedto.getActorname()!=null
	    			&& moviedto.getReleasedate()!=null
	    			&& moviedto.getReview()!=null
	    			&& moviedto.getTicketprice()>120
	    			&& moviedto.getTotalcollection()>27372872) {
	    	 if(moviedto.getActorname().length()>3
	    			 && moviedto.getActressname().length()>3
	    			 && moviedto.getDirectorname().length()>3
	    			 && moviedto.getGenre().length()>3
	    			 && moviedto.getLanguage().length()>3
	    			 && moviedto.getMoviename().length()>3
	    			 && moviedto.getProducername().length()>3
	    			 && moviedto.getReview().length()>3
	    			 && moviedto.getReleasedate().length()>3) {
	    		 System.out.println("validated and can be saved");
	    		 return "saved";
	    	 }else {
	    		 System.out.println("check moviename , genre , language , review , actorname , directorname , producername , releasedate and actressname");
	    	 }
	    }else {
	    	System.out.println("check everything");
	    }
     }
		
		return "not saved";
	}

}
