package com.avoris.exam.test.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

class SearchResultsTest {

    public static final String SEARCH_ID = "searchId";
    public static final int COUNT = 100;
    private SearchResults testObj;
    @Mock
    private SearchDetails searchDetailsMock;

    @BeforeEach
    private void setUp() {
        testObj = new SearchResults(SEARCH_ID, searchDetailsMock, COUNT);
    }

    @Test
    void getSearchId_shouldReturnSearchID() {
        final var result = testObj.getSearchId();

        assertThat(result).isEqualTo(SEARCH_ID);
    }

    @Test
    void getSearch_shouldReturnDetails() {
        final var result = testObj.getSearch();

        assertThat(result).isEqualTo(searchDetailsMock);
    }

    @Test
    void getCount_shouldReturnCount() {
        final var result = testObj.getCount();

        assertThat(result).isEqualTo(COUNT);
    }
}