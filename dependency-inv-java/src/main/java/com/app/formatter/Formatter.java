package com.app.formatter;

import com.app.exception.FormatException;
import com.app.model.Message;

public interface Formatter  {
	public String format(Message message) throws FormatException;
}
