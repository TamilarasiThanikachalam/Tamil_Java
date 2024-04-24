 package seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	static WebDriver driver;
//	RemoteWebDriver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement courseDropDown = driver.findElement(By.id("course"));
//		courseDropDown.click();

		driver.findElement(By.xpath("//option[text() = 'Javascript']")).click();

//		WebElement courseDropDown = driver.findElement(By.id("course"));

//		courseDropDown.click();

//		Thread.sleep(3000);
//
		Select select = new Select(courseDropDown);
//
		System.out.println(select.isMultiple());
//
		select.selectByIndex(3);
//
		Thread.sleep(5000);
//
		select.selectByValue("net");
//
		Thread.sleep(5000);
//
		select.selectByVisibleText("Java");
//
		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			System.out.println(each.getText());
		}

	}

	public void chooseOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	
	public void selectOptionByIndex(WebElement ele, int optionIndex) {
		Select select = new Select(ele);
		select.selectByIndex(optionIndex);	
	}
	
	public void selectOptionByVisibleText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);	
	}
	
	public void printAllOptionFromADropDown(WebElement ele) {
		Select select = new Select(ele);
		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			System.out.println(each.getText());
		}

	}
	
	public void validateAnOptionPresentInDropDown(WebElement ele, String optionName) {
		Select select = new Select(ele);
		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			if(each.getText().equalsIgnoreCase(optionName)) {
				System.out.println("Given option: "+optionName+ " is present in the drop down");
			}
		}
	}
	
	public void deSelectOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.deselectByValue(value);
	}

}
