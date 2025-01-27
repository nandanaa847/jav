package com.xworkz.validate.dto;

import java.util.Objects;

public class MovieDto {
	
	private String moviename;
	private int duration;
	private String genre;
	private float rating;
	private String language;
	private long budget;
	private String review;
	private double totalcollection;
	private String actorname;
	private String directorname;
	private String producername;
	private String releasedate;
	private int actorage;
	private int ticketprice;
	private String actressname;
	
	public MovieDto() {
		
	}

	public MovieDto(String moviename, int duration, String genre, float rating, String language, long budget,
			String review, double totalcollection, String actorname, String directorname, String producername,
			String releasedate, int actorage, int ticketprice, String actressname) {
		
		this.moviename = moviename;
		this.duration = duration;
		this.genre = genre;
		this.rating = rating;
		this.language = language;
		this.budget = budget;
		this.review = review;
		this.totalcollection = totalcollection;
		this.actorname = actorname;
		this.directorname = directorname;
		this.producername = producername;
		this.releasedate = releasedate;
		this.actorage = actorage;
		this.ticketprice = ticketprice;
		this.actressname = actressname;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public double getTotalcollection() {
		return totalcollection;
	}

	public void setTotalcollection(double totalcollection) {
		this.totalcollection = totalcollection;
	}

	public String getActorname() {
		return actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public String getDirectorname() {
		return directorname;
	}

	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}

	public String getProducername() {
		return producername;
	}

	public void setProducername(String producername) {
		this.producername = producername;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public int getActorage() {
		return actorage;
	}

	public void setActorage(int actorage) {
		this.actorage = actorage;
	}

	public int getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}

	public String getActressname() {
		return actressname;
	}

	public void setActressname(String actressname) {
		this.actressname = actressname;
	}

	@Override
	public String toString() {
		return "MovieDto [moviename=" + moviename + ", duration=" + duration + ", genre=" + genre + ", rating=" + rating
				+ ", language=" + language + ", budget=" + budget + ", review=" + review + ", totalcollection="
				+ totalcollection + ", actorname=" + actorname + ", directorname=" + directorname + ", producername="
				+ producername + ", releasedate=" + releasedate + ", actorage=" + actorage + ", ticketprice="
				+ ticketprice + ", actressname=" + actressname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(actorage, actorname, actressname, budget, directorname, duration, genre, language,
				moviename, producername, rating, releasedate, review, ticketprice, totalcollection);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDto other = (MovieDto) obj;
		return actorage == other.actorage && Objects.equals(actorname, other.actorname)
				&& Objects.equals(actressname, other.actressname) && budget == other.budget
				&& Objects.equals(directorname, other.directorname) && duration == other.duration
				&& Objects.equals(genre, other.genre) && Objects.equals(language, other.language)
				&& Objects.equals(moviename, other.moviename) && Objects.equals(producername, other.producername)
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating)
				&& Objects.equals(releasedate, other.releasedate) && Objects.equals(review, other.review)
				&& ticketprice == other.ticketprice
				&& Double.doubleToLongBits(totalcollection) == Double.doubleToLongBits(other.totalcollection);
	}

	
	
	
}
