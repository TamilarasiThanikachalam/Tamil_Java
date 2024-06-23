package xpathPractice;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartXpathPractice {
		static WebDriver driver;
	public static void main(String[] args) {
		FlipkartXpathPractice obj = new FlipkartXpathPractice();
		
		
		obj.launchBrowser(".\\src\\test\\resources\\drivers\\chromedriver.exe",
				"https://www.flipkart.com/");
		
		obj.searchQ("//input[@name='q']", "Mobiles", "//button[@type='submit']" );
//		obj.waitUntilElementLoaded("//a[text()='Login']");
		
//		obj.loginButtonOptions("//a[text()='Login']", "//div[text()='Sign Up']");
//		obj.closeLoginPage("//a[text()='Login']", "//div[text()='Sign Up']", "//div[@tabindex='-1']/div/button");
//		obj.moreHover();
		
		obj.getCategoryTypeUsingIterator();
		
//		driver.quit();
		
	}
	
	public void launchBrowser(String path, String url) {
		System.setProperty("webdriver.chrome.driver", 
				path);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
	}
	public void waitUntilElementLoaded(String xpath) {
		WebElement loginButton = driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20));
		wait.until(ExpectedConditions.elementToBeSelected(loginButton));
	}
// Primary Navigation Options
	
	public void searchQ(String xpath1, String searchText, String xpath2)	{
		WebElement searchTextBox = driver.findElement(By.xpath(xpath1));
		searchTextBox.sendKeys(searchText);
		WebElement submitbutton = driver.findElement(By.xpath(xpath2));
		submitbutton.click();
	}
	
	public void loginButtonOptions(String xpath1, String xpath2) {
		WebElement loginButton = driver.findElement(By.xpath(xpath1));
		WebElement signUp = driver.findElement(By.xpath(xpath2));
		Actions actions = new Actions(driver);
//		actions.moveToElement(loginButton).perform();
		actions.moveToElement(loginButton).moveToElement(signUp).click().perform();
		
	}
	
	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();	
	}
	
	public void closeLoginPage(String xpath1, String xpath2, String xpath3) {
//		loginButtonOptions(xpath1);
		click(xpath2);
		click(xpath3);
				
	}
	
	public void becameASeller() {
		driver.findElement(By.xpath
				("//a[@href='https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect']"));
		
	}
	
	public void moreHover() {
		WebElement more = driver.findElement(By.xpath("//div[text() ='More']"));
		Actions actions = new Actions(driver);
//		actions.moveToElement(more).perform();
		
	}
	
	public void cartButton() {
		WebElement cart = driver.findElement(By.xpath("//a[@href='/viewcart?exploreMode=true&preference=FLIPKART']//span"));
		
	}
	
//	Secondary Navigation Buttons
	
	public void categoryType() {
		driver.findElement(By.xpath("//span[text() = 'Electronics']"));
		driver.findElement(By.xpath("//span[text() = 'TVs & Appliances']"));
		driver.findElement(By.xpath("//span[text() = 'Men']"));
		
	}
	
	public void getCategoryTypeUsingIterator() {
		List<WebElement> categories = driver.findElements(By.xpath("//span[@class='TSD49J']"));
		for(WebElement eachCat: categories) {
			String categoryName =  eachCat.getText();
			System.out.println(categoryName);
		}
		
	}
	
	
	
	
	

}
