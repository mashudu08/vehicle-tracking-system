package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
