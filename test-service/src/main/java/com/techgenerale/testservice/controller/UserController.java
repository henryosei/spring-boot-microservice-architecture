package com.techgenerale.testservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {


    @GetMapping("/users")
    public String testmaping(){
        return "Hello World";
    }
}
