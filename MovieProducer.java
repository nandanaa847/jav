public class MovieProducer{
	
	public static void main(String[] args){
    
     Movie movie = new Movie();

       System.out.println("Movie");
       movie.movieName = "Raajakumara";
       movie.genre = "Family Drama";
       movie.duration = "2hr 28min";
       movie.language = "Kannada";
       movie.releaseYear = 2017;
       movie.rating = 7.9f;
       System.out.println(movie.movieName);
       System.out.println(movie.genre);
       System.out.println(movie.duration);
       System.out.println(movie.language);
       System.out.println(movie.releaseYear);
       System.out.println(movie.rating);
       movie.play();
   movie.pause();
     movie.stop();
   movie.messageofraajakumara();
   movie.success();

  System.out.println("Movie1");
 Movie movie1 = new Movie();
   movie.movieName = "777 Charlie";
       movie.genre = "Adventure, Comedy";
       movie.duration = "2hr 44min";
       movie.language = "Kannada";
       movie.releaseYear = 2022;
       movie.rating = 8.7f;
       System.out.println(movie.movieName);
       System.out.println(movie.genre);
       System.out.println(movie.duration);
       System.out.println(movie.language);
       System.out.println(movie.releaseYear);
       System.out.println(movie.rating);
       movie.play();
   movie.pause();
     movie.stop();
     movie.details();
   movie.messageof777charlie();
   movie.success();

 System.out.println("Movie2");
   Movie movie2 = new Movie();
   movie.movieName = "Kirik Party";
       movie.genre = "Comedy";
       movie.duration = "2hr 39min";
       movie.language = "Kannada";
       movie.releaseYear = 2016;
       movie.rating = 8.2f;
       System.out.println(movie.movieName);
       System.out.println(movie.genre);
       System.out.println(movie.duration);
       System.out.println(movie.language);
       System.out.println(movie.releaseYear);
       System.out.println(movie.rating);
       movie.play();
   movie.pause();
     movie.stop();
     movie.details();
   movie.messageofkirikparty();
   movie.success();

  System.out.println("Movie3"); 
    Movie movie3 = new Movie();
   movie.movieName = "Googly";
       movie.genre = "Romcom";
       movie.duration = "2hr 22min";
       movie.language = "Kannada";
       movie.releaseYear = 2013;
       movie.rating = 7.5f;
       System.out.println(movie.movieName);
       System.out.println(movie.genre);
       System.out.println(movie.duration);
       System.out.println(movie.language);
       System.out.println(movie.releaseYear);
       System.out.println(movie.rating);
       movie.play();
   movie.pause();
     movie.stop();
     movie.details();
   movie.messageofgoogly();
   movie.success();

  System.out.println("Movie4");
    Movie movie4 = new Movie();
   movie.movieName = "Train to busan";
       movie.genre = "Action, Horror";
       movie.duration = "1hr 58min";
       movie.language = "korea";
       movie.releaseYear = 2016;
       movie.rating = 7.6f;
       System.out.println(movie.movieName);
       System.out.println(movie.genre);
       System.out.println(movie.duration);
       System.out.println(movie.language);
       System.out.println(movie.releaseYear);
       System.out.println(movie.rating);
       movie.play();
   movie.pause();
     movie.stop();
     movie.details();
   movie.messageoftraintobusan();
   movie.success();
}
 

}