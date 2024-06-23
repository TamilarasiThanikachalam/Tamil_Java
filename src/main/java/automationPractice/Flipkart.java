package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	static WebDriver driver;
	
	public void launchBroswer(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
//		https://www.flipkart.com/
		driver.get(url);
		
	}
	public void findSerachAndSendKeys(String name, String searchText) {
//		//input[@name='q']
		WebElement q = driver.findElement(By.name(name));
		q.sendKeys(searchText);
		q.sendKeys(Keys.ENTER);
		
	}
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
//		https://www.flipkart.com/
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		
		WebElement poco = driver.findElement(By.xpath("//div[@title='POCO']//input"));
//		boolean ele = poco.isDisplayed();
		boolean ele = poco.isEnabled();
		System.out.println(ele);
//		WebElement poco = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[6]/div/label/input"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
		wait.until(ExpectedConditions.elementToBeClickable(poco));
		poco.click();
		
	}

}
