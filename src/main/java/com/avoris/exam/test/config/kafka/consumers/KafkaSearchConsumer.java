package com.avoris.exam.test.config.kafka.consumers;

import com.avoris.exam.test.model.SearchDetails;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaSearchConsumer {

    @KafkaListener(id = "searchConsumer", topics = "hotel_availability_searches")
    public void listen(SearchDetails data) {
        System.out.println(data.toString());
    }
}


