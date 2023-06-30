package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.dtos.SearchResultsDTO;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.transformers.Transformer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * Implementation of {@link Transformer}
 */
@Component
public class SearchResultsTransformerImpl implements Transformer<SearchResults, SearchResultsDTO> {

    @Resource
    private final Transformer<Search, SearchDTO> searchTransformer;
    @Resource
    private final Transformer<SearchDetails, SearchDetailsDTO> searchDetailsTransformer;

    public SearchResultsTransformerImpl(Transformer<Search, SearchDTO> searchTransformer, Transformer<SearchDetails, SearchDetailsDTO> searchDetailsTransformer) {
        this.searchTransformer = searchTransformer;
        this.searchDetailsTransformer = searchDetailsTransformer;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchResultsDTO modelToDto(SearchResults searchResults) {

        return SearchResultsDTO.builder()
                .searchId(searchResults.getSearchId())
                .search(searchDetailsTransformer.modelToDto(searchResults.getSearch()))
                .count(searchResults.getCount())
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchResults dtoToModel(SearchResultsDTO searchResultsDTO) {

        return SearchResults.builder()
                .searchId(searchResultsDTO.getSearchId())
                .search(searchDetailsTransformer.dtoToModel(searchResultsDTO.getSearch()))
                .count(searchResultsDTO.getCount())
                .build();
    }
}
