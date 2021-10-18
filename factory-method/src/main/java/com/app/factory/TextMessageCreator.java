package com.app.factory;

import com.app.model.Message;
import com.app.model.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new TextMessage();
	}



}
