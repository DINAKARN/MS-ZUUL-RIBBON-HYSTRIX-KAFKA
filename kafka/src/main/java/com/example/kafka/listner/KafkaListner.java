/**
 * 
 */
package com.example.kafka.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author dnaramala
 *
 */
@Service
public class KafkaListner {

	@KafkaListener(topics = "kafka_message_room", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Message:" + message);
	}
}
