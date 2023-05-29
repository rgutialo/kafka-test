package com.avoris.exam.test.services.impl;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.repositories.SearchRepository;
import com.avoris.exam.test.services.SearchService;
import jakarta.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link SearchService}
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Resource
    private final SearchRepository searchRepository;

    @Resource
    private final MongoTemplate mongoTemplate;

    public SearchServiceImpl(SearchRepository searchRepository, MongoTemplate mongoTemplate) {
        this.searchRepository = searchRepository;
        this.mongoTemplate = mongoTemplate;
    }

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
        final SearchDetails searchDetailsResponse = new SearchDetails("11111", "1234aBc", "29/12/2023", "31/12/2023", "1234", List.of(3, 29, 30, 1));
        List<SearchDetails> itemBySearchId = searchRepository.findAll();
        return new SearchResults(searchResponse.getSearchId(), searchDetailsResponse, 100);
    }
}
