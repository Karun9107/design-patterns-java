package com.app.exception;
import java.io.IOException;

//Thrown by formatter
@SuppressWarnings("serial")
public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
