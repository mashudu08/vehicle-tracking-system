package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.VehicleLocation;
import com.service.VehicleLocationService;

@RestController
@RequestMapping("/api/vehicle-location")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class VehicleLocationController {
	
	@Autowired
	private VehicleLocationService vlService;
	
	//get vehicle location
	@GetMapping("/get-vehicle-location")
	public List<VehicleLocation> getAllVehiclesLocation(){
			return vlService.read();
	}

}
