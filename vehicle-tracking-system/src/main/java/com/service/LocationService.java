package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Location;
import com.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	public Location create(Location location) {
		return locationRepository.save(location);
	}

	// read all vehicle locations
	public List<Location> read(){
		return locationRepository.findAll();
	}
	
	//read vehicle location by id
	public Location read(Integer id) {
		Optional<Location> temp = locationRepository.findById(id);
		Location location = null;
		if(temp.isPresent()) {
			location = temp.get();
		}
		return location;
	}
	
}
