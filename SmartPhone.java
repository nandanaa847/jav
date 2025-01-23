package com.xworkz.abstractthings;

public abstract class SmartPhone {
	
        private String brand;
		private int price;
		private String color;
		private String ram;
		private int releaseyear;
		
		public SmartPhone() {
			
		}
		
		public SmartPhone( String brand , int price , String color , String ram , int releaseyear) {
			
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.ram = ram;
			this.releaseyear = releaseyear;
		}
		
		//static methods
		public static void switchon() {
	        System.out.println("phone is switched on");
	    }

	    public static void switchoff() {
	        System.out.println("Switching off the phone");
	    }

	    public static void displaybattery() {
	        System.out.println("Cleaning the printing press");
	    }

	    public static void displaybrightness() {
	        System.out.println("Restarting the printing press");
	    }
	    
	    //instance method
	    public void openwatsapp() {
	    	 System.out.println("opening the watsapp");
	    }
	    public void openchat() {
	   	 System.out.println("opening the chat");
	   }
	    public void textwithchinmaye() {
	   	 System.out.println("texting with chinmaye");
	   }
	    public void closewatsapp() {
	   	 System.out.println("closing the watsapp");
	   }
	    //abstract methods
	   public abstract void playmusic();
	   public abstract void playmovie();
	   public abstract void updatephone();
	   public abstract void stopmusic();
		
	   public void displaydetails() {
		   System.out.println(brand);
		   System.out.println(price);
		   System.out.println(color);
		   System.out.println(ram);
		   System.out.println(releaseyear);
	   }
	    }


