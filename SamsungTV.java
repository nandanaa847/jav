public class SamsungTV{
	
	static String model;
	static String manufacturer;
    String warranty;
	String screensize;
	

	public static void model(){
       SamsungTV.model = "Samsung QLED";
		System.out.println(SamsungTV.model);
	}

	public static void manufacturer(){
       SamsungTV.manufacturer = "Samsung";
		System.out.println(SamsungTV.manufacturer);
	}

	public void warranty(){
       System.out.println("2 years");
	}

	public void screensize(){
       System.out.println("55inchess");
	}
}
