package com.example.agnents.controllers;

import java.util.Optional;

import com.example.agnents.models.Farmer;
import com.example.agnents.repositories.FarmerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/farmer")
@CrossOrigin(origins = "*")
public class FarmerController {
    @Autowired
    private FarmerRepository farmerRepository;

    @GetMapping("")
    @Async
    public Iterable<Farmer> getAllFarmer() {
        return farmerRepository.findAll();
    }

    @PostMapping("")
    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @DeleteMapping("/delete")
    public void deleteFarmer(Farmer farmer) {
        farmerRepository.delete(farmer);
    }

    @GetMapping("/{farmerId}")
    @Async
    public Optional<Farmer> findFarmer(long farmerId) {
        return farmerRepository.findById(farmerId);
    }
}
