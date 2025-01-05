package org.testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderClass {

	static File file;
	static FileInputStream inputStream;
	static Properties p;
	
	public PropertyReaderClass(String fileName) {
		try {
		file = new File(fileName);
		inputStream = new FileInputStream(file);
		p = new Properties();
		p.load(inputStream);
		}catch(FileNotFoundException e) {
			System.out.println("Throw the NullpointerException");
		}catch(IOException e) {
			
		}
	}
	public  String getProperty(String key) {
		String property = p.getProperty(key);
		return property;
	}
}
