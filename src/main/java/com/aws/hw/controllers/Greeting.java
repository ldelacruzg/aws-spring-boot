package com.aws.hw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Greeting {
    @GetMapping("/greeting")
    public String greeting() {
        return "Hola Mundo desde Spring Boot";
    }
}
