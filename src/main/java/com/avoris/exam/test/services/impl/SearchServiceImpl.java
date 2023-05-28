package com.avoris.exam.test.services.impl;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.services.SearchService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link SearchService}
 */
@Service
public class SearchServiceImpl implements SearchService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Search addSearch(SearchDetails searchDetails) {
        //TODO: Send to kaftka

        return new Search("1234");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchResults findResults(Search search) {
        //TODO: Send to Mongo
        final Search searchResponse = new Search("xxxx");
        final SearchDetails searchDetailsResponse = new SearchDetails("1234aBc", "29/12/2023", "31/12/2023", List.of(3, 29, 30, 1));
        return new SearchResults(searchResponse.getSearchId(), searchDetailsResponse, 100);
    }
}
