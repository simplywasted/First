package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	
	public static String dataReader(String key) {
		
		String filePath = ".\\src\\main\\resources\\commonData.properties";
		
		try ( FileInputStream fs = new FileInputStream(filePath)){
			
			Properties ps = new Properties();
			ps.load(fs);
			String value = ps.getProperty(key);
			return value;
	
		} 
		
		catch (Exception e) {
			
			System.out.println("Property File not found at: " + filePath);
			e.printStackTrace();
			return null;
		}
		
	}
}

