package com.expedia.flightBookingFeature;

public class Hotel 
{
	private String gointo;
	private String checkinDate;
	private String checkOutDate;
	private int noofTravAdults=0;
	private int noofTravchildren=0;
	private boolean addaflight=false;
	public String getGointo() {
		return gointo;
	}
	public void setGointo(String gointo) {
		this.gointo = gointo;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public boolean isAddaflight() {
		return addaflight;
	}
	public void setAddaflight(boolean addaflight) {
		this.addaflight = addaflight;
	}
	public int getNoofTravAdults() {
		return noofTravAdults;
	}
	public void setNoofTravAdults(int noofTravAdults) {
		this.noofTravAdults = noofTravAdults;
	}
	public int getNoofTravchildren() {
		return noofTravchildren;
	}
	public void setNoofTravchildren(int noofTravchildren) {
		this.noofTravchildren = noofTravchildren;
	}
	
}
