package com.avoris.exam.test.config.kafka.consumers;

import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.repositories.SearchRepository;
import jakarta.annotation.Resource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaSearchConsumer {

    @Resource
    private final SearchRepository searchRepository;

    public KafkaSearchConsumer(final SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @KafkaListener(id = "searchConsumer", topics = "hotel_availability_searches")
    public void listen(SearchDetails data) {
        final SearchDetails save = searchRepository.save(data);
        System.out.println(save.toString());
    }
}


