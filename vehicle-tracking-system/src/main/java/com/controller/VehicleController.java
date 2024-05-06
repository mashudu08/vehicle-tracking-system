package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Vehicle;
import com.service.VehicleService;


@RestController
@RequestMapping("/api/vehicle")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	// create registration
	@PostMapping
	public Vehicle createVehicleRegistration(@RequestBody Vehicle vehicle) {
		return vehicleService.create(vehicle);
	}
	
	// view all registered vehicles
	@GetMapping("/get-vehicles")
	public List<Vehicle> getAllRegisteredVehicles(){
		return vehicleService.read();
	}
	
	// view all registered vehicle by id
	@GetMapping("/{id}")
	public Vehicle getRegisteredVehicleById(@PathVariable("id") Integer id)
	{
		return vehicleService.read(id);
	}
	
	//update registered vehicle
	@PutMapping("/update")
	public Vehicle updateRegisteredVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleService.update(vehicle);
	}
		  
}
