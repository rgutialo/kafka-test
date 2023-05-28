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

/**
 * Main Rest Controller for this test
 */
@RestController
public class SearchController {

    @Resource
    private final SearchFacade searchFacade;

    public SearchController(SearchFacade searchFacade) {
        this.searchFacade = searchFacade;
    }

    /**
     * Add a new Search to the system
     *
     * @param searchDetailsDTO must be not null
     * @return searchDTO object with searchId for this search
     */
    @PostMapping("/search")
    public ResponseEntity<SearchDTO> addSearch(@RequestBody @NonNull SearchDetailsDTO searchDetailsDTO) {

        SearchDTO searchDTO = searchFacade.addSearch(searchDetailsDTO);
        return ResponseEntity.accepted().body(searchDTO);
    }

    /**
     * Find results based on a certain searchId
     *
     * @param searchDTO must be not null
     * @return SearchResults object with searchId, search Details and number of results
     */
    @GetMapping("/count")
    public ResponseEntity<SearchResultsDTO> findResults(@RequestBody @NonNull SearchDTO searchDTO) {

        SearchResultsDTO searchResultsDTO = searchFacade.findResults(searchDTO);
        return ResponseEntity.ok().body(searchResultsDTO);
    }
}
