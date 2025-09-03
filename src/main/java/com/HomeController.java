package com.flipkart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Root URL mapping
    @GetMapping("/")
    public String home() {
        return "Welcome to Flipkart!";
    }

    // Example extra endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}

