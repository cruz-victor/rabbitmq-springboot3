package com.ubicuosoft.sm.queue.publisherconsumer.publisher;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PublisherConfig {
    @Value("readings")
    private String queueName;

    @Bean
    public Queue queue(){
        return new Queue(queueName, true);
    }
}
