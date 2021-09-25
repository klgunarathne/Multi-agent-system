package com.example.agnents;

import java.util.List;
import java.util.Optional;

import com.example.agnents.models.User;
import com.example.agnents.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public List<User> getUserLogins() {
        return loginRepository.findAll();
    }

    public Optional<User> getUserLoginById(long id) {
        return loginRepository.findById(id);
    }
}
