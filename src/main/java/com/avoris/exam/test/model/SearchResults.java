package com.avoris.exam.test.model;

import lombok.Builder;
import lombok.Data;

/**
 * Internal Search Results model implementation
 */
@Data
@Builder
public class SearchResults {

    private String searchId;
    private SearchDetails search;
    private Integer count;
}
