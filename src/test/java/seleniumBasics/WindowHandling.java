package seleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	static WebDriver driver;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();

//		System.out.println(((RemoteWebDriver) driver).getSessionId());

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);

		System.out.println(driver.getTitle());

		String orangeHRMLoginPage = driver.getWindowHandle();
		System.out.println(orangeHRMLoginPage);

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);

//		for(String eachWindowHandle: allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//			if(driver.getTitle().contains("AlertsDemo")) {
//				break;
//			}	
//			if(!driver.getTitle().contains("AlertsDemo")) 
//				driver.close();
//		}
//		System.out.println(driver.getTitle());

//		String AlertDemoHandle = "";
//		for (String eachWindowHandle : allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//
//			if (driver.getTitle().contains("AlertsDemo")) {
//				AlertDemoHandle = driver.getWindowHandle();
//			}
//			if(!driver.getWindowHandle().equalsIgnoreCase(AlertDemoHandle)) {
//				driver.close();
//			}
//		}
//		driver.switchTo().window(AlertDemoHandle);
//		System.out.println(driver.getTitle());

//		for(String eachWindowHandle: allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//			Thread.sleep(5000);
//		}

		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			System.out.println(driver.getTitle());
			try {
				WebElement ele = driver.findElement(By.xpath("//h1[contains(text(), 'AlertsDemo')]"));
//			if(ele.isDisplayed()) {
//				break;
//			}
				break;
			} catch (Exception e) {
//				System.out.println(e.getMessage());
				System.out.println("11111");
			}
		}
		System.out.println("***" + driver.getTitle());
//		driver.findElement(By.className("post-title entry-title"));
	}

	public void windowHandlingOrangeHRM() throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();

//		System.out.println(((RemoteWebDriver) driver).getSessionId());

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href = 'https://www.facebook.com/OrangeHRM/']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(@href, 'twitter.com')]")).click();
		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		String orangeHRMLoginPage = driver.getWindowHandle();
		System.out.println(orangeHRMLoginPage);

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);

		for (String eachWindowHandle : allWindowHandles) {
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
				break;
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
				break;
			}
		}
	}

	public void switchToWindowBasedOnElement(WebElement element) {
		String parentWindow = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			System.out.println(driver.getTitle());
			try {
				if (element.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
