package com.xworkz.abstractthings;

public class Oppo extends SmartPhone{
	

	public Oppo(String brand , int price , String color , String ram , int releaseyear) {
			super( brand ,  price ,  color ,  ram ,  releaseyear);
		}

		@Override
		public void playmusic() {
			System.out.println("playing the music");
			
		}

		@Override
		public void playmovie() {
			System.out.println("playing the movie");
			
		}

		@Override
		public void updatephone() {
			System.out.println("updating the phone");
			
		}

		@Override
		public void stopmusic() {
			System.out.println("stopping the music");
			
		}

	}


