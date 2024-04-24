package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);
		
		 js.executeScript("window.scrollBy(0,5000)");
		 
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollTo(0, 0)");
		 
		 js.executeScript("alert('Welcome to Guru99');");
		 
//		 js.executeScript("arguments[0].scrollIntoView();", element); 
		 
//		 js.executeScript("arguments[0].click();", element);
		 
//		 js.executeScript("arguments[0].value='---your email id---';", element);
	}

}
