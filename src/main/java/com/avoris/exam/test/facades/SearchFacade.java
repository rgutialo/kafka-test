package com.avoris.exam.test.facades;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.dtos.SearchResultsDTO;

/**
 * Search Facade which controls input and output for search requests
 */
public interface SearchFacade {

    /**
     * Manages new search requests
     *
     * @param searchDetailsDTO {@link SearchDetailsDTO} containing details about the search
     * @return {@link SearchDTO} object if exists
     */
    public SearchDTO addSearch(final SearchDetailsDTO searchDetailsDTO);

    /**
     * Manages results from certain search id requests
     *
     * @param searchDTO {@link SearchDTO}containing search id to look for
     * @return {@link SearchResultsDTO} which contains details about the search object received
     */
    public SearchResultsDTO findResults(final SearchDTO searchDTO);
}
