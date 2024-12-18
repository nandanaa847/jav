package com.xworkz.project_online.Things;

public class IDCard {
	
	private String studentname;
	private int validity;
	private String usn;
	private String collegename;
	private int dateofbirth;
	
	public IDCard() {
		System.out.println("Default constructor");
	}
	
	public void setStudentName(String studentname) {
		this.studentname = studentname;
	}
	
	public String getStudentName() {
		return studentname;
	}
	
	public void setValidity(int validity) {
		this.validity = validity;
	}
	
	public int getValidity() {
		return validity;
	}
	
	public void setUSN(String usn) {
		this.usn = usn;
	}
	
	public String getUSN() {
		return usn;
	}
	
	public void setCollegeName(String collegename) {
		this.collegename = collegename;
	}
	
	public String getCollegeName() {
		return collegename;
	}
	
	public void setDateOfBirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public int getDateOfBirth() {
		return dateofbirth;
	}
	
	
	@Override
	public String toString() {
		
		return "StudentName:"+this.studentname+" "+"Validity:"+this.validity+" "+"USN:"+this.usn+" "+"CollegeName:"+this.collegename+" "+"DateOfBirth:"+this.dateofbirth;
	}

}
