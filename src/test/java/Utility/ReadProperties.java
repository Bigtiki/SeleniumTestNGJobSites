package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadProperties {
	
	public static FileInputStream readFile( String filePath) throws FileNotFoundException {
		return new FileInputStream(new File(filePath));
	}
	public static Map<String,String> readProperties() throws FileNotFoundException, IOException {
		Properties propReader= new Properties();
		propReader.load(readFile(System.getProperty("user.dir")+"//src//test//resources//config.properties"));
		
		Map <String, String>properties = new HashMap<String, String>();
		
		Enumeration<Object> KeyValues = propReader.keys();
		while(KeyValues.hasMoreElements()){
			String key = (String) KeyValues.nextElement();
			String value = propReader.getProperty(key);
			properties.put(key, System.getProperty(key, value));
		}
		return properties;
	}

}
