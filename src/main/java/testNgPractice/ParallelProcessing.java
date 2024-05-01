package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelProcessing {

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver" , 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver" , 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
	}
}
