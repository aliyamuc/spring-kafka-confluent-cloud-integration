package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SystemKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public SystemKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send("wisemate-topic",0,"key1",msg);
        kafkaTemplate.flush();
        log.info("Message has been published: "+ msg);
    }

}
