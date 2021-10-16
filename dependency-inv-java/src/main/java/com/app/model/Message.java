package com.app.model;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {
	private String message;
	private LocalDateTime timestamp;
	
	public Message(String message) {
		this.message = message;
		timestamp = LocalDateTime.now(ZoneId.of("UTC"));
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
}
