package com.avoris.exam.test.services;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;

/**
 * Manages service search operations
 */
public interface SearchService {

    /**
     * Send a new Search query to queues
     *
     * @param searchDetails {@link SearchDetails} containing all details related to the query search
     * @return {@link Search} with the result added
     */
    public Search addSearch(final SearchDetails searchDetails);

    /**
     * Find search queries based on query received
     *
     * @param search {@link Search} containing all details related to the search requested
     * @return {@link SearchResults} with details about the query received
     */
    public SearchResults findResults(final Search search);
}
