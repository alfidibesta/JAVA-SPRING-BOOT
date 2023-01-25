package com.spring.learndto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learndto.dto.UserLocationDTO;
import com.spring.learndto.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userLocation")
    public List<UserLocationDTO> getAllUserLocation() {
        return userService.getAllUserLocation();
    }
}
