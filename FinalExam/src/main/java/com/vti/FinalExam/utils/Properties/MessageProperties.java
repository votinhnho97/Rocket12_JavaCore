package com.vti.FinalExam.utils.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageProperties {
	public static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\resource\\messages.properties";
	private Properties properties;

	public MessageProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCES_PATH));
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
