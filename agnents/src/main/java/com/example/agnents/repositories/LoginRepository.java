package com.example.agnents.repositories;

import com.example.agnents.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {

}
