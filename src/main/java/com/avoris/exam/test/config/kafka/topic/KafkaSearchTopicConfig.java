package com.avoris.exam.test.config.kafka.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaSearchTopicConfig {

    @Value("${spring.kafka.hotelTopic}")
    public String hotelTopic;

    public String getHotelTopic() {
        return hotelTopic;
    }

    @Bean
    public NewTopic createHotelTopic() {
        return new NewTopic(hotelTopic, 1, (short) 1);
    }
}
