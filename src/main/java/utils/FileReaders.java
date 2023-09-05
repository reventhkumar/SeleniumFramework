package utils;

import java.util.Properties;

import org.rev.selenium.base.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  


public class FileReaders extends BaseClass{

	
	public String configData(String Value) {
		
		Properties properties = new Properties();
		FileInputStream inputStream;
		
		try {
			inputStream = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//propertyFiles//ConfigData.properties");
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to locate the file");
			e.printStackTrace();
		}catch ( IOException e) {
			System.out.println("Something went wrong with IO");
			e.printStackTrace();
		}
		
		return properties.getProperty(Value);
	}

}
