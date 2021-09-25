package com.example.agnents.controllers;


import java.util.Optional;

import com.example.agnents.models.Seller;
import com.example.agnents.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seller")
@CrossOrigin(origins = "*")
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping("")
    @Async
    public String getAllSellers() {
        return sellerRepository.findAll().toString();
    }

    @PostMapping("")
    public Seller saveSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @DeleteMapping("/delete")
    public void deleteSeller(Seller seller) {
        sellerRepository.delete(seller);
    }

    @GetMapping("/{sellerId}")
    @Async
    public Optional<Seller> findSeller(long sellerId) {
        return sellerRepository.findById(sellerId);
    }
}
