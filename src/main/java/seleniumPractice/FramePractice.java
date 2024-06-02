package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//TAMIL//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		driver.findElement(By.xpath("//a[@href= 'frames.php']")).click();
		WebElement iframe1 =  driver.findElement(By.xpath("//iframe[@src='new-tab-sample.php'][1]"));
		
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//a[@href = 'https://www.tutorialspoint.com']")).click();
//		driver.switchTo().frame("Iframe 1");
		
		driver.switchTo().defaultContent();
		WebElement iframe2 =  driver.findElement(By.xpath("//iframe[@src='new-tab-sample.php'][2]"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.xpath("//a[@href = 'https://www.tutorialspoint.com']")).click();  
		
		

	}
	
//	https://chercher.tech/practice/frames	
	

}
