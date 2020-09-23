package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SystemKafkaConsumer {

    @KafkaListener(topics = "wisemate-topic", groupId = "wisemate-kafka-consumer-group")
    public void listenMessagesForWisemateKafkaConsumerGroup(String message) {
        log.info("Received Message: " + message);
    }

}
