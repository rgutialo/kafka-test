package com.avoris.exam.test.services.impl;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.services.SearchService;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public Search addSearch(SearchDetails searchDetails) {
        //TODO: Send to kaftka

        return new Search("1234");
    }
}
