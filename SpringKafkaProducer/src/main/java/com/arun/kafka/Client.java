package com.arun.kafka;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;


public class Client {

	public static void main(String[] args) {
		KafkaTemplate<Integer, String> kt = new AnnotationConfigApplicationContext(KafkaConfig.class).getBean(KafkaTemplate.class);
		try {
			TimeUnit.SECONDS.sleep(2);
			kt.send("stridertopic", "strider talks again");
			TimeUnit.SECONDS.sleep(2);
			kt.send("elendil", "elendil talks again");
			TimeUnit.SECONDS.sleep(2);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
