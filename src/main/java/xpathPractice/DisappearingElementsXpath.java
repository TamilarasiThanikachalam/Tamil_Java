package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElementsXpath {
	WebDriver driver;
	
	public void loginMenu() {
		
//		Sign-Up
		driver.findElement(By.xpath("//div[text()='Sign Up']"));
//		My Profile
		driver.findElement(By.xpath("//div[text()='My Profile']"));
		
	}
	
	public void moreMenu() {
//		Advertise
		driver.findElement(By.xpath("//div[text()='Advertise']"));
	}
	
	public void electronics() {
		
		WebElement firstDropDown = driver.findElement(By.xpath("//a[@title='Mobiles']"));
		WebElement lastDropDown =  driver.findElement(By.xpath("//a[@title='Motorola g8 power lite']"));
	
//		To get all 18 options
		driver.findElements(By.xpath("//div[@class=\"wZsanD\"][1]//a"));	
		
//		To get all 83 Options
		driver.findElements(By.xpath("//div[@class=\"wZsanD\"]//a"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
