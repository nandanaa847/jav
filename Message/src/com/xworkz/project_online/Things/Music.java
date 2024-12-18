package com.xworkz.project_online.Things;

public class Music {

	private String musicname;
	private int duration;
	private String genre;
	private String language;
	private String singername;
	
	public Music() {
		System.out.println("Default constructor");
	}
	
	public void setMusicName(String musicname) {
		this.musicname = musicname;
	}
	
	public String getMusicName() {
		return musicname;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setSingerName(String singername) {
		this.singername = singername;
	}
	
	public String getSingerName() {
		return singername;
	}
	@Override
	public String toString() {
		
		return "MusicName:"+this.musicname+" "+"Duration:"+this.duration+" "+"Genre:"+this.genre+" "+"Language:"+this.language+" "+"SingerName:"+this.singername;
	}
}
