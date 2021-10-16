package com.app.formatter;

import com.app.exception.FormatException;
import com.app.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFormatter implements Formatter{
	
	@Override
	public String format(Message message) throws FormatException{
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException error) {
			error.printStackTrace();
			throw new FormatException(error);
		}
	}
}
