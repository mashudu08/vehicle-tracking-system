package com.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="vehicleId", referencedColumnName = "vehicleId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Vehicle vehicle;
	private double latitude;
	private double longitude;
	private String timestamp;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(int locationId, Vehicle vehicle, double latitude, double longitude, String timestamp) {
		super();
		this.locationId = locationId;
		this.vehicle = vehicle;
		this.latitude = latitude;
		this.longitude = longitude;
		this.timestamp = timestamp;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", vehicle=" + vehicle + ", latitude=" + latitude + ", longitude="
				+ longitude + ", timestamp=" + timestamp + "]";
	}
}
