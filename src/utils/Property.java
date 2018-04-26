package utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Property {

	public static String getValue(String key)
	{
		File file = new File("./src/config/config.properties");
		String value = null;
		try{
		
			FileReader fr = new FileReader(file);
			Properties config = new Properties();
			config.load(fr);
			value = config.getProperty(key);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			return value;
	}
}
