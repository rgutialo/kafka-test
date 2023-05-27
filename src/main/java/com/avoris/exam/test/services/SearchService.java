package com.avoris.exam.test.services;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;

public interface SearchService {

    public Search addSearch(final SearchDetails searchDetails);

    public SearchResults findResults(final Search search);
}
