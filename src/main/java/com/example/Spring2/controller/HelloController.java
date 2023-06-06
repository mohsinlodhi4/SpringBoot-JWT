package com.example.Spring2.controller;

import com.example.Spring2.entity.DAOUser;
import com.example.Spring2.entity.JwtResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> hello(){

        return ResponseEntity.ok("hi");
    }

    @RequestMapping("user")
    public ResponseEntity<UserDetails> getMe(Authentication authentication){
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("Username: "+ userDetails.getUsername());

        return ResponseEntity.ok(userDetails);



    }
}
