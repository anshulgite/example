package com.autoanotation;

public class Address {
	String city,road;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", road=" + road + "]";
	}

	public Address(String city, String road) {
		super();
		this.city = city;
		this.road = road;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
