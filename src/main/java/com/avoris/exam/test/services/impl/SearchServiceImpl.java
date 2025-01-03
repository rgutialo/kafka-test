package com.avoris.exam.test.services.impl;

import com.avoris.exam.test.config.kafka.topic.KafkaSearchTopicConfig;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.model.SearchResults;
import com.avoris.exam.test.repositories.SearchRepository;
import com.avoris.exam.test.repositories.SendingMessagesRepository;
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
    private final SendingMessagesRepository sendingMessagesRepository;

    @Resource
    private final KafkaSearchTopicConfig kafkaSearchTopicConfig;

    @Resource
    private final MongoTemplate mongoTemplate;

    public SearchServiceImpl(SearchRepository searchRepository, final SendingMessagesRepository sendingMessagesRepository, final KafkaSearchTopicConfig kafkaSearchTopicConfig, MongoTemplate mongoTemplate) {
        this.searchRepository = searchRepository;
        this.sendingMessagesRepository = sendingMessagesRepository;
        this.kafkaSearchTopicConfig = kafkaSearchTopicConfig;
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Search addSearch(SearchDetails searchDetails) {
        return sendingMessagesRepository.sendMessage(kafkaSearchTopicConfig.getHotelTopic(), searchDetails);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchResults findResults(Search search) {
        //TODO: Send to Mongo
        final List<SearchDetails> searchResult = searchRepository.findItemBySearchId(search.getSearchId());
        return SearchResults.builder()
                .searchId(search.getSearchId())
                .search(searchResult.get(0))
                .count(searchResult.size())
                .build();
    }
}
