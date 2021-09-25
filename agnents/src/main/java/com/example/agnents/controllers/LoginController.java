package com.example.agnents.controllers;

import java.text.BreakIterator;
import java.util.List;
import java.util.Optional;

import com.example.agnents.LoginService;
import com.example.agnents.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("")
    public List<User> getUserLogins() {
        return loginService.getUserLogins();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserLoginById(@PathVariable Long id) {
        return loginService.getUserLoginById(id);
    }

    @GetMapping("/login/{userName}/{password}")
    public Optional<User> getUserByUsernameAndPassword(@PathVariable String userName, @PathVariable String password) {
        List<User> users = loginService.getUserLogins();
        Optional<User> userInDb = Optional.empty();
        for(User usr: users) {
            if (usr.getUserName().equals(userName) && usr.getPassword().equals(password)) {
                userInDb = Optional.of(usr);
            }
        }
        return userInDb;
    }
}
