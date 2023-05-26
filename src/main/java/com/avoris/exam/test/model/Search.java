package com.avoris.exam.test.model;

public class Search {
    private final String searchId;
    public String getSearchId() {
        return searchId;
    }

    public Search(String searchId) {
        this.searchId = searchId;
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchId='" + searchId + '\'' +
                '}';
    }
}
