package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.VehicleLocation;

public interface VehicleLocationRepository extends JpaRepository<VehicleLocation, Integer>{

}
