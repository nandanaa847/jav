package com.xworkz.project_online.things;

public class Application {
	
	private String username;
	private int password;
	private String theme;
	private String appname;
	private int age;
	
	public Application(String username , int password , String theme , String appname , int age) {
		
		this.username = username;
		this.password = password;
		this.theme = theme;
		this.appname = appname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return "Username="+this.username+" "+"Password="+this.password+" "+"Theme="+this.theme+" "+"Appname="+this.appname+" "+"Age="+this.age;
	
}

}
