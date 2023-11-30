package com.example.kafkapractice.service;

import com.example.kafkapractice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, Order> getKafkaTemplate;
    
    public void sendMessage(Order order) {
        getKafkaTemplate.send("my-topic-4", order);
    }
}
