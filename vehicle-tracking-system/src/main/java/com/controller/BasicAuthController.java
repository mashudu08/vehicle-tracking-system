package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.SpringSecurityConfig;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BasicAuthController {
	
	@PostMapping("/login")
    public String Login(Authentication authentication) {
        if (authentication != null && authentication.getName() != null) {
            String userName = authentication.getName();
            return "Welcome " + userName;
        } else {
            return "Welcome";
        }
    }
	
}
