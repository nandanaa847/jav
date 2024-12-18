package com.xworkz.project_online.Runner;

import com.xworkz.project_online.Things.Music;

public class MusicRunner {
	
public static void main(String[] args) {
		
	    Music music = new Music();
	    music.setMusicName("Paravashanadenu");
		System.out.println(music.getMusicName());
		
		music.setDuration(236);
		System.out.println(music.getDuration());
		
		music.setGenre("Deep Affection");
		System.out.println(music.getGenre());
		
		music.setLanguage("Kannada");
		System.out.println(music.getLanguage());
		
		music.setSingerName("Sonu Nigam");
		System.out.println(music.getSingerName());
		
		System.out.println(music.toString());
	}

}
