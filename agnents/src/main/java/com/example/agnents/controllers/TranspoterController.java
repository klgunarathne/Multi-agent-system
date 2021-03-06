package com.example.agnents.controllers;

import java.util.Optional;

import com.example.agnents.models.Transporter;
import com.example.agnents.repositories.TransporterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transpoter")
@CrossOrigin(origins = "*")
public class TranspoterController {
    @Autowired
    private TransporterRepository transporterRepository;

    @GetMapping("")
    @Async
    public Iterable<Transporter> getTranspoters() {
        return transporterRepository.findAll();
    }

    @GetMapping("/{transpoterId}")
    @Async
    public Optional<Transporter> getTransporter(Long transpoterId) {
        return transporterRepository.findById(transpoterId);
    }

    @PostMapping("")
    public Transporter saveTransporter(Transporter transpoter) {
        return transporterRepository.save(transpoter);
    }

    @DeleteMapping("/delete")
    public void deleteTransporter(Transporter transpoter) {
        transporterRepository.delete(transpoter);
    }
}
