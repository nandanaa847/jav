package com.xworkz.project_online.things;

public class Optical {

	private String pupilsize;
	private String focallength;
	private String cornealcurvature;
	private float accommodation;
	private String fieldofvision;
	
	public Optical(String pupilsize , String focallength , String cornealcurvature , float accommodation , String fieldofvision) {
		
		this.pupilsize = pupilsize;
		this.focallength = focallength;
		this.cornealcurvature = cornealcurvature;
		this.accommodation = accommodation;
		this.fieldofvision = fieldofvision;
		
	}
		
		
		
	

		@Override
		public String toString() {
			
			return "PupilSize:"+this.pupilsize+" "+"Focallength:"+this.focallength+" "+"Cornealcurvature:"+this.cornealcurvature+" "+"Accommodation:"+this.accommodation+" "+"Fieldofvision:"+this.fieldofvision;
		
	}
}
