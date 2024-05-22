package readWritePropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFilePractice {
	
	
	public static void main(String[] args) throws IOException {
		
		getProp("name");
		getProp("company");
//		getCompany("company");
				

	}
//	public static void getName(String perName) throws IOException {
	public static void getProp(String prop) throws IOException {
		FileInputStream fis = new FileInputStream("config1.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		System.out.println(properties.getProperty(prop));
		
	}
	
//	public static void getCompany(String persCompany) throws IOException {
//		FileInputStream fis = new FileInputStream("config1.properties");
//		Properties properties = new Properties();
//		properties.load(fis);
//		
//		System.out.println(properties.getProperty(PersCompany));
//		
//	}


}
