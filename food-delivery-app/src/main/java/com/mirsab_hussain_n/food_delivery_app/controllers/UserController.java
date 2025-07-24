package com.mirsab_hussain_n.food_delivery_app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mirsab_hussain_n.food_delivery_app.*;
import com.mirsab_hussain_n.food_delivery_app.entity.*;
import com.mirsab_hussain_n.food_delivery_app.repository.*;

import java.util.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")  //for react port 
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody User user){
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            return ResponseEntity.badRequest().body("Email already exists");
        }
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
        
    }

    
}
