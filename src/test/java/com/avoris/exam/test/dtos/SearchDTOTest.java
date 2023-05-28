package com.avoris.exam.test.dtos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchDTOTest {

    private SearchDTO testObj;
    public static final String SEARCH_ID = "searchId";

    @BeforeEach
    private void setUp() {
        testObj = new SearchDTO(SEARCH_ID);
    }

    @Test
    void getSearchId_shouldReturnSearchId() {
        final var result = testObj.getSearchId();

        assertThat(result).isEqualTo(SEARCH_ID);
    }
}