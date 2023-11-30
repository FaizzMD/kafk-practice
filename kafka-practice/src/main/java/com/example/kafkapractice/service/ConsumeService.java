package com.example.kafkapractice.service;

import com.example.kafkapractice.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Service;

@Service
public class ConsumeService {
    @KafkaListener(
        topicPartitions = @TopicPartition(topic = "my-topic-4",
            partitionOffsets = {
                @PartitionOffset(partition = "0", initialOffset = "0"))
    public void consume(Order message, @Header(KafkaHeaders.GROUP_ID) String group,
                        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
        System.out.println("Received Message in group : %s and %s:  %s".formatted(group,topic,message.toString()));
    }
}
