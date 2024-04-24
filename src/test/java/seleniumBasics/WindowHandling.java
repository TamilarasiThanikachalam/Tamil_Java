package seleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowHandling {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();

		System.out.println(((RemoteWebDriver) driver).getSessionId());

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href = 'https://www.facebook.com/OrangeHRM/']")).click();
		Thread.sleep(5000);

		System.out.println(driver.getTitle());
		
		String orangeHRMHomePage = driver.getWindowHandle();
		System.out.println(orangeHRMHomePage);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		for(String eachWindowHandle: allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
		}
		
	}
		
		public void test() {
		

		String parentWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

//		driver.switchTo().window(parentWindowHandle);

//		for (String eachWindowHandle : allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			if (driver.getTitle().contains("World's Most Popular Opensource HRIS")) {
//				System.out.println(driver.getTitle());
//			}
//		}

//		for(String eachWindowHandle: allWindowHandles) {
//			if(!eachWindowHandle.equals(parentWindowHandle)) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//			}
//		}

//		CANT SWITCH USING ELEMENT - DO NOT USE
//		WebElement forgotAccountLink = driver.findElement(By.xpath("//a[text() = 'Forgotten account?']"));
//		for(String eachWindowHandle: allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//			if(driver.findElement(By.xpath("//a[text() = 'Forgotten account?']")).isDisplayed()) {
//			break;
//			}
//		}

//		for (String eachWindowHandle : allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//				driver.close();
//			}

		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
//		driver.switchTo().window(parentWindowHandle);

	}

	public void closeAllChildWindows() {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
	}

	public void closeAllChildWindows(String parentWinHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWinHandle)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWinHandle);
		System.out.println(driver.getTitle());
	}

	public void switchWindowBasedOnTitle(String windowTitle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			if (driver.getTitle().contains(windowTitle)) {
				System.out.println(driver.getTitle());
			}
		}
	}

	public void switchToChildWindow() {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
				System.out.println(driver.getTitle());
			}
		}
	}

}
