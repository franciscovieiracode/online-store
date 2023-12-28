package com.onlinestore.onlineStore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRest {

    @GetMapping("/test")
    public String getString(){
        return "o132321la123312";
    }
}
