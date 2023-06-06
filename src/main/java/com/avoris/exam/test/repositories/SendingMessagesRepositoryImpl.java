package com.avoris.exam.test.repositories;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import jakarta.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendingMessagesRepositoryImpl implements SendingMessagesRepository {

    @Resource
    private final KafkaTemplate<String, SearchDetails> kafkaTemplate;

    public SendingMessagesRepositoryImpl(final KafkaTemplate<String, SearchDetails> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Search sendMessage(final String topic, final SearchDetails searchDetails) {
        kafkaTemplate.send(topic, searchDetails);
        return new Search("1234Kafka");
    }
}
