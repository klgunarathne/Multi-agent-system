package com.example.agnents.repositories;

import com.example.agnents.models.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
