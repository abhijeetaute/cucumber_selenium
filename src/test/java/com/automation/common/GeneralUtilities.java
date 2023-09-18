package com.automation.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GeneralUtilities {
	public static Properties properties=null;
	
	public static String readProperty(String propertyName) {
	
		properties=new Properties();
		try {
			properties.load(new FileInputStream(FrameworkConstants.CONFIG_FILE));
		} catch (IOException e) {
			System.out.println("file not found "+e);
		}
		
		return properties.getProperty(propertyName);
		
	}

}
