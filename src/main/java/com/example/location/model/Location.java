package com.example.location.model;

public class Location {
	
	private String locationName;
	private String locationAddress;
	private double lat,lang;
	
	
	public Location(String locationName, String locationAddress, double lat, double lang) {
		super();
		this.locationName = locationName;
		this.locationAddress = locationAddress;
		this.lat = lat;
		this.lang = lang;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationAddress() {
		return locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLang() {
		return lang;
	}
	public void setLang(double lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", locationAddress=" + locationAddress + ", lat=" + lat
				+ ", lang=" + lang + "]";
	}
	

}
