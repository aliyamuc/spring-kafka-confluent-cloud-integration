package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/api/system/")
public class SystemController {

    @Autowired
    private SystemKafkaProducer systemKafkaProducer;

    @PostMapping(value = "/publish")
    public void publishMsgIntoKafka(){
        systemKafkaProducer.sendMessage("Hello World Kafka!");
    }


}
