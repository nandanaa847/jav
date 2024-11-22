public class Library{
	
	public static void main(String[] args){

	String branchname = "Computer Science";
	int size = branchname.length();
	System.out.println(size);

	String webseries = "All of use";
	String value = webseries.concat("are Dead");
	System.out.println(value);

    String planetname = "Earth";
	boolean checking = planetname.equals("Jupiter ");
	System.out.println(checking);

	String eventname = "Kannada utsava";
	boolean verifying = eventname.endsWith("utsava");
	System.out.println(verifying);

	String weathercondition = "Partly cloudy";
	boolean testing = weathercondition.startsWith("cloudy");
	System.out.println(testing);

	String animal = "Lion";
	boolean confirming = animal.isEmpty();
	System.out.println(confirming);

	String yogaPose = "downward dog";
	String yoga = yogaPose.toUpperCase();
	System.out.println(yoga);

	String paymentmethod = "UPI";
	String paying = paymentmethod.toLowerCase();
	System.out.println(paying);

	String bookname = "The Hard things about hard things";
	char book = bookname.charAt(7);
	System.out.println(book);

	String password = "nandanaa";
	int result = password.indexOf("a");
	System.out.println(result);
      
     String studentname = "Poorna";
	String studentname1 = "Chinmaye";
	int compare = studentname.compareTo(studentname1);
	System.out.println(compare);

	String hotel = "Nammoora Ahaara Vaibaa";
	String correction = hotel.replace("Vaibaa","Vaibhava");
	System.out.println(correction);




}
}