package com.arun.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@KafkaListener(topics = "stridertopic")
    public void listenToStriderTopic(String foo) {
		System.out.println("Strider Message: "+ foo);   
	}
	
	@KafkaListener(topics = "elendil")
    public void listenToElendilTopic(String foo) {
		System.out.println("Elendil Message: "+ foo);   
	}

}
