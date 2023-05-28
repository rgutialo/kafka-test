package com.avoris.exam.test.dtos;

/**
 * Contains basic information about Search Results object exposed to external systems
 */
public class SearchResultsDTO {
    private final String searchId;
    private final SearchDetailsDTO search;
    private final Integer count;

    public SearchResultsDTO(String searchId, SearchDetailsDTO search, Integer count) {
        this.searchId = searchId;
        this.search = search;
        this.count = count;
    }

    public String getSearchId() {
        return searchId;
    }

    public SearchDetailsDTO getSearch() {
        return search;
    }

    public Integer getCount() {
        return count;
    }
}
