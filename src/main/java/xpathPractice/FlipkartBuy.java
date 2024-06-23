package xpathPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class FlipkartBuy extends FlipkartXpathPractice{

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	WebDriver driver = null;
	
//	public void openFlipkartAndBuyPhone() {
		
//		FlipkartXpathPractice obj1 = new FlipkartXpathPractice();
//		obj1.launchBrowser("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));	
		
//		Find search text box using name locator
//		driver.findElement(By.name("q"));
		
//		Find search text box using xpath:
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchTextBox.sendKeys("Mobiles");
		searchTextBox.submit();
		
		WebElement minDropDown = driver.findElement(By.xpath("//div[@class='suthUA']/select"));
		
		Select selectMin = new Select(minDropDown);
		selectMin.selectByIndex(1);
		
//		WebElement maxDropDown = driver.findElement(By.xpath("//div[@class='tKgS7w']/select"));
//		
//		Select selectMax = new Select(maxDropDown);
//		selectMax.selectByIndex(3);
//		selectMax.selectByValue("20000");
//		selectMax.selectByVisibleText("₹20000");
		
//		Max Drop Down without using Select class
		
		List<WebElement> maxDDOptions =	driver.findElements(By.xpath("//div[@class='tKgS7w']//option"));
		
		for(WebElement eachMaxOpt : maxDDOptions) {
			if(eachMaxOpt.getText().equalsIgnoreCase("₹20000")) {
				eachMaxOpt.click();
				break;
				
			}
		}
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)");
		
		
//		driver.findElement(By.xpath("//span[text()='47 MORE']")).click();
//		WebElement morePhoneBrand = driver.findElement(By.xpath("//span[text()='47 MORE']"));
//		morePhoneBrand.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
