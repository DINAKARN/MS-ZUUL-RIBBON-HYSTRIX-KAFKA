/**
 * 
 */
package com.example.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dnaramala
 *
 */
@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

	private final static String ROOM = "kafka_messages_room";

	@Autowired
	private KafkaTemplate<String, String> kafaktemplate;

	@GetMapping("/data/{message}")
	public String returndata(@PathVariable("message") final String message) {
		kafaktemplate.send(ROOM, message);
		return "sent successfully";
	}

}
