package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suitePractice {
	
	
	// Launch the browser
	// Open google.com, bing.com and yahoo.com
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver" , 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		startTime = System.currentTimeMillis();
		}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com");
	}
	
	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total execution time is " +totalTime);
	}
	
}
