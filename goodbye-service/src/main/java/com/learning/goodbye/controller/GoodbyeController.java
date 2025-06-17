package com.learning.goodbye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goodbye")
public class GoodbyeController {

    @GetMapping
    public String goodbye() {
        return "Goodbye from Goodbye Service!";
    }
} 