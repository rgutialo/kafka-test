package com.avoris.exam.test.transformers;

import com.avoris.exam.test.dtos.SearchResultsDTO;
import com.avoris.exam.test.model.SearchResults;

public interface SearchResultsTransformer {

    public SearchResultsDTO modelToDto(final SearchResults searchResults);

    public SearchResults dtoToModel(final SearchResultsDTO searchResultsDTO);
}
