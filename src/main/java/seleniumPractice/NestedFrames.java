package seleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrames {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		NestedFrames obj = new NestedFrames();
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//TAMIL//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		obj.switchToFrame(obj.locateWebElementById("frame1"));
		obj.locateWebElementAndSendKeys("//input[@type = 'text']", "Java");
	    obj.pauseExecution(10);
		
//		Inner Frame
		
		obj.switchToFrame(obj.locateWebElementById("frame3"));
		obj.locateWebElementById("a").click();	
		obj.pauseExecution(10);
		
		obj.switchToParent();
		obj.locateWebElementByXpath("//input[@type = 'text']").clear();
		obj.locateWebElementAndSendKeys("//input[@type = 'text']", "Selenium");
		
		obj.switchToDefaultContent();
		obj.switchToFrame(obj.locateWebElementById("frame2"));
		
		//Drop Down using select class
		WebElement dropDown =  obj.locateWebElementById("animals");
		
		Select select = new Select(dropDown);
		select.selectByIndex(0);
		select.selectByValue("avatar");
		select.selectByVisibleText("Avatar");
		
		List<WebElement> allOptions = select.getOptions();
		
		for(int i=0; i<=allOptions.size(); i++) {
			List<WebElement> allOpt = select.getOptions();
			WebElement eachOption =  allOpt.get(i);
			if(eachOption.getText().equalsIgnoreCase("babycat")) {
				break;
			}
			eachOption.click();
		}
		
//		for(WebElement eachOption: allOptions) {
//				if(eachOption.getText().equalsIgnoreCase("babycat")) {
//				System.out.println("babycat");
//				eachOption.click();
//			}
//			
//		}
	}
	
	public WebElement locateWebElementById(String id) {
		 WebElement elem =  driver.findElement(By.id(id));
		 return elem;
	}
	
	public WebElement locateWebElementByXpath(String xpath) {
		 WebElement ele =  driver.findElement(By.xpath(xpath));
		 return ele;
	}
	
	public void locateWebElementAndSendKeys(String xpath, String text) {
		WebElement ele =  driver.findElement(By.xpath(xpath));
		ele.sendKeys(text);
		
	}
	
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	public void pauseExecution(long time) throws InterruptedException {
		TimeUnit.SECONDS.sleep(time);
	}
	
	
	public void switchToParent() {
		driver.switchTo().parentFrame();
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	

}
