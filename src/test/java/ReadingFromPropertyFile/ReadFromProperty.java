package ReadingFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class ReadFromProperty {

	public static void main(String[] args) throws Exception {
		ReadFromProperty readProp = new ReadFromProperty();
		String value = readProp.getAProperty("name");
		System.out.println(readProp.getAProperty("name"));
		System.out.println(value);
		
		readProp.setAProperty();
	}
	
	public String getAProperty(String propName) throws Exception {
		File file = new File(".\\src\\test\\resources\\test.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(propName);
	}
	
	public void setAProperty() throws Exception {
		
		Properties prop = new Properties();
		prop.setProperty("Role", "QA Lead");
		
		prop.store(new FileWriter(".\\src\\test\\resources\\test.properties"),"");  
//		prop.store(new FileOutputStream(".\\src\\test\\resources\\test.properties"),null);  
		
	}

}
