package com.avoris.exam.test.repositories;

import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SearchRepository extends MongoRepository<SearchDetails, String> {

    SearchResults findItemBySearchId(String searchId);

    List<SearchDetails> findAll();
}
