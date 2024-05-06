package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.VehicleLocation;
import com.repository.VehicleLocationRepository;


@Service
public class VehicleLocationService {

	@Autowired
	private VehicleLocationRepository vlRepository;
	
	public VehicleLocation create(VehicleLocation location) {
		return vlRepository.save(location);
	}

	// read all vehicle locations
	public List<VehicleLocation> read(){
		return vlRepository.findAll();
	}
	
	//read vehicle location by id
	public VehicleLocation read(Integer id) {
		Optional<VehicleLocation> temp = vlRepository.findById(id);
		VehicleLocation location = null;
		if(temp.isPresent()) {
			location = temp.get();
		}
		return location;
	}
}
