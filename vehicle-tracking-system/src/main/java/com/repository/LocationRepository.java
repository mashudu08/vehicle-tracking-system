package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{

}
