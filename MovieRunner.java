package com.xworkz.validate.runner;

import com.xworkz.validate.dto.MovieDto;
import com.xworkz.validate.service.MovieService;
import com.xworkz.validate.service.MovieServiceImple;

public class MovieRunner {

public static void main(String[] args) {
	
	MovieDto moviedto = new MovieDto();
	
	moviedto.setActorage(40);
	moviedto.setActorname("yash");
	moviedto.setActressname("kriti");
	moviedto.setBudget(364737776);
	moviedto.setDirectorname("pavan wadiyar");
	moviedto.setDuration(142);	
	moviedto.setGenre("comedy");
	moviedto.setLanguage("kannada");
	moviedto.setProducername("jayanna");
	moviedto.setRating(9.5f);
	moviedto.setReleasedate("january 2013");
	moviedto.setReview("Goodd");
	moviedto.setTicketprice(250);
	moviedto.setTotalcollection(365365638);
	moviedto.setMoviename("googly");
	
	System.out.println(moviedto);
	
	MovieService movieservice = new MovieServiceImple();
movieservice.validateAnddSave(moviedto);
	}
}
