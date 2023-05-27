package com.avoris.exam.test.model;

public class SearchResults {

    private final String searchId;
    private final SearchDetails search;
    private final Integer count;

    public SearchResults(String searchId, SearchDetails search, Integer count) {
        this.searchId = searchId;
        this.search = search;
        this.count = count;
    }

    public String getSearchId() {
        return searchId;
    }

    public SearchDetails getSearch() {
        return search;
    }

    public Integer getCount() {
        return count;
    }
}
