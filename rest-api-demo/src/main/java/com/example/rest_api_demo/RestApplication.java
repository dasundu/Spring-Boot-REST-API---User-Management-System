package com.example.rest_api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @GetMapping("/")
    public String rootEndpoint() {
        String message = "Hello, world!";
        return message;
    }

    // Modified to accept a parameter
    @GetMapping("/hello")
    public String helloWithName(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}