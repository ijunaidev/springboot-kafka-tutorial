package com.example.springbootkafkatutorial.kafka;

import com.example.springbootkafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class JsonKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user) {
        logger.info("Json message received:{}", user.toString());
    }
}
