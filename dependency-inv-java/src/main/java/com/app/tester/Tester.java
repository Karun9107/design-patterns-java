package com.app.tester;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.formatter.JSONFormatter;
import com.app.model.Message;
import com.app.writer.MessagePrinter;

public class Tester {
	public static void main(String[] args) throws IOException {
		Message message = new Message("This is a new message");
		MessagePrinter printer = new MessagePrinter();
		try(PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(message, new JSONFormatter(), writer);
		}
	}
}
