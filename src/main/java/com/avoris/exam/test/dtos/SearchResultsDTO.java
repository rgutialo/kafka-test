package com.avoris.exam.test.dtos;

import lombok.Builder;
import lombok.Data;

/**
 * Contains basic information about Search Results object exposed to external systems
 */
@Data
@Builder
public class SearchResultsDTO {
    private final String searchId;
    private final SearchDetailsDTO search;
    private final Integer count;
}
