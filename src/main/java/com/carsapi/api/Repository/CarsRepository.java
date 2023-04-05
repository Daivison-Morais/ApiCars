package com.carsapi.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carsapi.api.models.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {
    
}
