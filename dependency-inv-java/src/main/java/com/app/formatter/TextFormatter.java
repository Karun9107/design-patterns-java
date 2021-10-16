package com.app.formatter;

import com.app.model.Message;

//Formats Message to plain text
public class TextFormatter implements Formatter{

	public String format(Message message){
		return message.getTimestamp()+":"+message.getMessage();
	}
}
