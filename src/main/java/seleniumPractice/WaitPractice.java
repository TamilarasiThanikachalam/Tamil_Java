package seleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\TAMIL\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		List<WebElement> allMenu = driver.findElements(By.xpath("//ul[@id = 'menu-top']//li//a"));
//https://stackoverflow.com/questions/50088777/how-to-click-child-links-of-each-menu-in-selenium-with-java	
		
		for (int i = 0; i <= allMenu.size(); i++) {
	        List<WebElement> links = driver.findElements(By.xpath("//ul[@id = 'menu-top']//li//a"));
	        WebElement menuLinks = links.get(i);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20));
			wait.until(ExpectedConditions.elementToBeClickable(menuLinks));
			
			menuLinks.click();
		}
		driver.close();

//		driver.quit();
		
//		for(WebElement eachMenu: allMenu) {
//			eachMenu.click();
//			Thread.sleep(3);
//			System.out.println(eachMenu.getAttribute("href"));
//		}
		
//		for(int i = 0 ; i<allMenu.size(); i++) {
//			
//			WebElement selectedMenu = allMenu.get(i);
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
//			wait.until(ExpectedConditions.elementToBeClickable(selectedMenu));
//			selectedMenu.click();
//			Thread.sleep(3);
//			System.out.println(selectedMenu);
//		}
		
//		for(WebElement eachMenu: allMenu) {
//			eachMenu.click();
//			Thread.sleep(3);
//			System.out.println(eachMenu.getAttribute("href"));
//		}
		
		
		
		
	}
	

}

//for(WebElement eachMenu: allMenu) {
//	
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
//wait.until(ExpectedConditions.elementToBeClickable(eachMenu));
//
//eachMenu.click();
//System.out.println(eachMenu);
//}
