package com.avoris.exam.test.controllers;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/search")
    public ResponseEntity<Search> addSearch(@RequestBody @NonNull SearchDetails searchDetails){

        System.out.println(searchDetails.toString());
        return ResponseEntity.created(null).build();
    }
}
