public class Moviee{
	
	String name;
	int releaseyear;
	int duration;
	float rating;
	String genre;
	long budget;
	String language;

 Moviee(String name, int releaseyear, int duration, float rating, String genre, long budget, String language){

	this.name = name;
	this.releaseyear = releaseyear;
	this.duration = duration;
	this.rating = rating;
	this.genre = genre;
	this.budget = budget;
	this.language = language;
}

	public Moviee(){
		this.name = "777Charlie";
	this.releaseyear = 2022;
	this.duration = 164;
	this.rating = 8.7f;
	this.genre = "A";
	this.budget = 200000000;
	this.language = "Kannada";


	
}


}