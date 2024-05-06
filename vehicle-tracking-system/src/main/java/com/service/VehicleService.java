package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Vehicle;
import com.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	// create vehicle registration
	public Vehicle create(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
	
	// read all registered vehicles
	public List<Vehicle> read(){
		return vehicleRepository.findAll();
	}
	
	// read registered vehicle by id
	public Vehicle read(Integer id) {
		Optional<Vehicle> temp = vehicleRepository.findById(id);
		Vehicle vehicle = null;
		if(temp.isPresent())
		{
			vehicle = temp.get();
		}
		return vehicle;
	}
	
	// update vehicle registration
	public Vehicle update(Vehicle vehicle) {
		Optional<Vehicle> temp = vehicleRepository.findById(vehicle.getVehicleId());
		if(temp.isPresent())
		{
			vehicleRepository.save(vehicle);
			return vehicle;
		}else {
			return null;
		}
	}
	
}
