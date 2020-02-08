package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class SharedConfig {
	public static Map<String, String> config;
	static {
		try {
			config=ReadProperties.readProperties();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
