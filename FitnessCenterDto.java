package com.xworkz.validate.dto;

import java.util.Objects;

public class FitnessCenterDto {
	
	private String centreName;
	private String location;
	private int fees;
	private int noofmonths;
	private String trainername;
	
	public FitnessCenterDto() {
		
	}

	public FitnessCenterDto(String centreName, String location, int fees, int noofmonths, String trainername) {
		super();
		this.centreName = centreName;
		this.location = location;
		this.fees = fees;
		this.noofmonths = noofmonths;
		this.trainername = trainername;
	}

	

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getNoofmonths() {
		return noofmonths;
	}

	public void setNoofmonths(int noofmonths) {
		this.noofmonths = noofmonths;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	@Override
	public String toString() {
		return "FitnessCenterDto [centreName=" + centreName + ", location=" + location + ", fees=" + fees
				+ ", noofmonths=" + noofmonths + ", trainername=" + trainername + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(centreName, fees, location, noofmonths, trainername);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitnessCenterDto other = (FitnessCenterDto) obj;
		return Objects.equals(centreName, other.centreName) && fees == other.fees
				&& Objects.equals(location, other.location) && noofmonths == other.noofmonths
				&& Objects.equals(trainername, other.trainername);
	}
	
	
}
