package seleniumBasics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	static WebDriver driver;
//	RemoteWebDriver;

	public static void pauseExecution(long time) throws InterruptedException {
		TimeUnit.SECONDS.sleep(time);
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		WebElement courseDropDown = driver.findElement(By.id("course"));
//		courseDropDown.click();
		
		List<WebElement>  allOptions = driver.findElements(By.xpath("//select[@id='course']//option"));
		for(WebElement eachOption: allOptions) {
			if(eachOption.getText().equalsIgnoreCase("Python")) {
				eachOption.click();
			}
		}
		
	}
	
	public static void dropDownUsingSelectClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		WebElement courseDropDown = driver.findElement(By.id("course"));
//		courseDropDown.click();
//		driver.findElement(By.xpath("//option[text() = 'Javascript']")).click();

		WebElement courseDropDown = driver.findElement(By.id("course"));
//		courseDropDown.click();

		Select select = new Select(courseDropDown);

		System.out.println(select.isMultiple());

		select.selectByIndex(3);

//		Thread.sleep(5000);
		pauseExecution(5);

		select.selectByValue("net");

		Thread.sleep(5000);

		select.selectByVisibleText("Java");

		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			System.out.println(each.getText());
		}

	}

	public void chooseOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}

//	Select select;
	public void selectOptionByIndex(WebElement ele, int optionIndex) {
//		select = new Select(ele);
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
			if (each.getText().equalsIgnoreCase(optionName)) {
				System.out.println("Given option: " + optionName + " is present in the drop down");
			} else
				System.out.println("Given option: " + optionName + " is NOT present in the drop down");
		}
	}
	
	public void chooseOptionFromDropDownWithoutUsingSelectClass(String xpath, String optionName) {
//		List<WebElement>  allOptions = driver.findElements(By.xpath("//select[@id='course']//option"));
//		for(WebElement eachOption: allOptions) {
//			if(eachOption.getText().equalsIgnoreCase("Python")) {
//				eachOption.click();
//			}
//		}
		
		List<WebElement>  allOptions = driver.findElements(By.xpath(xpath));
		for(WebElement eachOption: allOptions) {
			if(eachOption.getText().equalsIgnoreCase(optionName)) {
				eachOption.click();
			}
		}
		
	}
	
//	List<WebElement>  allOptions = driver.findElements(By.xpath(xpath));
	public void chooseOptionFromDropDownWithoutUsingSelectClass(List<WebElement> elements, String optionName) {
		
		for(WebElement eachOption: elements) {
			if(eachOption.getText().equalsIgnoreCase(optionName)) {
				eachOption.click();
			}
		}
		
	}

	public void getFirstSelectedOption(WebElement ele) {
		Select select = new Select(ele);
		select.getFirstSelectedOption();
	}

	public void deSelectOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.deselectByValue(value);
	}

	public void deSelectOptionByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.deselectByIndex(index);
	}

}
