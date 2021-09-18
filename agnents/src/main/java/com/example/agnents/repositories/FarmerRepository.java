package com.example.agnents.repositories;

import com.example.agnents.models.Farmer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {    
}
