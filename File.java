public class File{
	public static void main(String[] args){
      
      employee("poorna");
      employee(453);
      employee(150000);
      employee(5.6);
      employee(true);
      employee(2000);
      employee(98442576l);
      employee(47.5f);
      }     
	public static void employee(String name){
	System.out.println("employee name is:" + name);
	
	}
	public static void employee(short identity){
	System.out.println("employee identity is:" + identity);

    }
    public static void employee(int salary){
	System.out.println("employee salary is:" + salary);
}
  public static void employee(double number){
	System.out.println("employee height is:" + number);
		}
		  public static void employee(boolean name){
	System.out.println("employee name poorna:" + name);
}
  public static void employee(byte birthyear){
	System.out.println("employee birthyear is:" + birthyear);
}
  public static void employee(long number){
	System.out.println("employee phonenumber is:" + number);
}
public static void employee(float weight){
	System.out.println("employee weight is:" + weight);
}
}