package com.avoris.exam.test.facades.impl;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.dtos.SearchResultsDTO;
import com.avoris.exam.test.facades.SearchFacade;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.services.SearchService;
import com.avoris.exam.test.transformers.SearchDetailsTransformer;
import com.avoris.exam.test.transformers.SearchResultsTransformer;
import com.avoris.exam.test.transformers.SearchTransformer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SearchFacadeImpl implements SearchFacade {

    @Resource
    private final SearchDetailsTransformer searchDetailsTransformer;
    @Resource
    private final SearchTransformer searchTransformer;
    @Resource
    private final SearchResultsTransformer searchResultsTransformer;
    @Resource
    private final SearchService searchService;

    public SearchFacadeImpl(SearchDetailsTransformer searchDetailsTransformer, SearchTransformer searchTransformer, SearchResultsTransformer searchResultsTransformer, final SearchService searchService) {
        this.searchDetailsTransformer = searchDetailsTransformer;
        this.searchTransformer = searchTransformer;
        this.searchResultsTransformer = searchResultsTransformer;
        this.searchService = searchService;
    }

    @Override
    public SearchDTO addSearch(final SearchDetailsDTO searchDetailsDTO) {
        final SearchDetails searchDetails = searchDetailsTransformer.dtoToModel(searchDetailsDTO);
        final Search search = searchService.addSearch(searchDetails);
        return searchTransformer.modelToDto(search);

    }

    @Override
    public SearchResultsDTO findResults(SearchDTO searchDetailsDTO) {
        final Search search = searchTransformer.dtoToModel(searchDetailsDTO);
        final SearchResults searchResults = searchService.findResults(search);
        return searchResultsTransformer.modelToDto(searchResults);
    }
}
