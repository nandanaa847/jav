public class MovieeRunner{
	
	public static void main(String[] args){

		Moviee moviee = new Moviee("Raajakumara" , 2017 , 148 , 7.9f , "Action" , 200000000 , "Kannada");

		System.out.println(moviee.name);
		System.out.println(moviee.releaseyear);
		System.out.println(moviee.duration);
		System.out.println(moviee.rating);
		System.out.println(moviee.genre);
		System.out.println(moviee.budget);
		System.out.println(moviee.language);

Moviee moviee1 = new Moviee();
		System.out.println(moviee1.name);
		System.out.println(moviee1.releaseyear);
		System.out.println(moviee1.duration);
		System.out.println(moviee1.rating);
		System.out.println(moviee1.genre);
		System.out.println(moviee1.budget);
		System.out.println(moviee1.language);

		
	}
}