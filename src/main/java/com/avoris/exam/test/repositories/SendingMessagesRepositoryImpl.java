package com.avoris.exam.test.repositories;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;
import jakarta.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class SendingMessagesRepositoryImpl implements SendingMessagesRepository {

    @Resource
    private final KafkaTemplate<String, SearchDetails> kafkaTemplate;

    public SendingMessagesRepositoryImpl(final KafkaTemplate<String, SearchDetails> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Search sendMessage(final String topic, final SearchDetails searchDetails) {
        try {
            final CompletableFuture<SendResult<String, SearchDetails>> received = kafkaTemplate.send(topic, searchDetails);
            return Search.builder()
                    .searchId(received.get().getProducerRecord().value().getSearchId())
                    .build();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return Search.builder()
                    .searchId("1234")
                    .build();
        }
    }
}
