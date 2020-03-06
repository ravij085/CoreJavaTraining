package com.yessInfoTech.serialization;

import java.io.Serializable;

public class Address implements Serializable{
	
	String cityName;
	public Address(String cityName, int distance) {
		super();
		this.cityName = cityName;
		this.distance = distance;
	}
	int distance;

}
