package com.avoris.exam.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
