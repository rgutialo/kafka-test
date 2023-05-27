package com.avoris.exam.test.controllers;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.dtos.SearchResultsDTO;
import com.avoris.exam.test.facades.SearchFacade;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Resource
    private final SearchFacade searchFacade;

    public SearchController(SearchFacade searchFacade) {
        this.searchFacade = searchFacade;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("/search")
    public ResponseEntity<SearchDTO> addSearch(@RequestBody @NonNull SearchDetailsDTO searchDetailsDTO) {

        SearchDTO searchDTO = searchFacade.addSearch(searchDetailsDTO);
        return ResponseEntity.accepted().body(searchDTO);
    }

    @GetMapping("/count")
    public ResponseEntity<SearchResultsDTO> addSearch(@RequestBody @NonNull SearchDTO searchDTO) {

        SearchResultsDTO searchResultsDTO = searchFacade.findResults(searchDTO);
        return ResponseEntity.ok().body(searchResultsDTO);
    }
}
