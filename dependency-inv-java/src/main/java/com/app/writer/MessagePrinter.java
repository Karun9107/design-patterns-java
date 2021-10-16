package com.app.writer;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.formatter.Formatter;
import com.app.model.Message;

public class MessagePrinter {
	public void writeMessage(Message message, Formatter formatter, PrintWriter writer) throws IOException {
		
	
		 //Here the object JSONFormatter is tightly coupled with this class. If we want to implement another formatter, say XML, then we will have to modify this class
		// Instead we use the abstraction Formatter by using it as a param
		 //Formatter formatter = new JSONFormatter();
		
		// we can do the same for PrintWriter object as well
//		try(PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
//			writer.println(formatter.format(message));
//			writer.flush();
//		}
		
		writer.println(formatter.format(message));
		writer.flush();
	}
}
