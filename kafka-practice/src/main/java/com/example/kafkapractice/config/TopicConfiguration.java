package com.example.kafkapractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {
    
    @Bean
    public NewTopic newTopic(){
        
        return TopicBuilder.name("my-topic-4")
            .partitions(1)
            .replicas(1)
            .build();
        
    }
}
