package com.xworkz.project_online.things;

public class ClassRoom {
	
	private int noofstu;
	private String teachername;
	private int duration;
	private String subject;
	private String stuname;
	
	public ClassRoom(int noofstu , String teachername , int duration , String subject , String stuname) {
		
		this.noofstu = noofstu;
		this.teachername = teachername;
		this.duration = duration;
		this.subject = subject;
		this.stuname = stuname;
	}
	
	@Override
	public String toString() {
		
		return "noofStudents:"+this.noofstu+" "+"Teachername:"+this.teachername+" "+"duration:"+this.duration+" "+"Subject:"+this.subject+" "+"StudentName:"+this.stuname;
		}
	}


