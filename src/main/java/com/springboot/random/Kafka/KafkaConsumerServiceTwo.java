package com.springboot.random.Kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceTwo {

    @KafkaListener(topics = "test-topic", groupId = "my-group2")
    public void listen(String message) {
        System.out.println("Consumed message by Service 2: " + message);
    }
}
