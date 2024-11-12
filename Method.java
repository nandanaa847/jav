public class Method{
	
	public static void main(String[] args){

	Employee("Poorna");
	Employee(50000);
	Employee(47.55f);

	inveniofest(20,"Saree");
	inveniofest("western",21);

	location("MGRoad");
    location(562159 , "MGRoad");
   


	}

	public static void Employee(String name){
	System.out.println("Emoloyee name is:" +name);
}
    public static void Employee(int salary){
	System.out.println("Emoloyee salary is:" +salary);
}
    public static void Employee(float weight){
	System.out.println("Emoloyee weight is:" +weight);
}
    public static void inveniofest(int date , String dresscode){
	System.out.println("Invenio fest first day date and dresscode is: " + date + " and " + dresscode);
	}
	public static void inveniofest(String dresscode , int date){
	System.out.println("Invenio fest second day dresscode and date is: "  + dresscode + " and  " + date);
	}
	public static void location(String area){
	System.out.println("location area is:" + area);
	}
	public static void location(int pincode , String area){
	System.out.println("location pincode and area is:" + pincode + " and " + area);
	}
}