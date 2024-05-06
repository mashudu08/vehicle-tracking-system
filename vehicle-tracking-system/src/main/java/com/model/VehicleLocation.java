package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class VehicleLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicle_locationId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Vehicle vehicle;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="locationId", referencedColumnName = "locationId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Location Location;

	public VehicleLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleLocation(int vehicle_locationId, Vehicle vehicle, com.model.Location location) {
		super();
		this.vehicle_locationId = vehicle_locationId;
		this.vehicle = vehicle;
		Location = location;
	}

	public int getVehicle_locationId() {
		return vehicle_locationId;
	}

	public void setVehicle_locationId(int vehicle_locationId) {
		this.vehicle_locationId = vehicle_locationId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "VehicleLocation [vehicle_locationId=" + vehicle_locationId + ", vehicle=" + vehicle + ", Location="
				+ Location + "]";
	}
	
	
}
