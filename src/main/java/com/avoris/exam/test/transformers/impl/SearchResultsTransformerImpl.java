package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchResultsDTO;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.transformers.SearchDetailsTransformer;
import com.avoris.exam.test.transformers.SearchResultsTransformer;
import com.avoris.exam.test.transformers.SearchTransformer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SearchResultsTransformerImpl implements SearchResultsTransformer {

    @Resource
    private final SearchTransformer searchTransformer;
    @Resource
    private final SearchDetailsTransformer searchDetailsTransformer;

    public SearchResultsTransformerImpl(SearchTransformer searchTransformer, SearchDetailsTransformer searchDetailsTransformer) {
        this.searchTransformer = searchTransformer;
        this.searchDetailsTransformer = searchDetailsTransformer;
    }

    @Override
    public SearchResultsDTO modelToDto(SearchResults searchResults) {

        return new SearchResultsDTO(searchResults.getSearchId(), searchDetailsTransformer.modelToDto(searchResults.getSearch()), searchResults.getCount());
    }

    @Override
    public SearchResults dtoToModel(SearchResultsDTO searchResultsDTO) {

        return new SearchResults(searchResultsDTO.getSearchId(), searchDetailsTransformer.dtoToModel(searchResultsDTO.getSearch()), searchResultsDTO.getCount());
    }
}
