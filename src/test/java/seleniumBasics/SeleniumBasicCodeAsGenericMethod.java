package seleniumBasics;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fileReading.PropertyFileReading;

public class SeleniumBasicCodeAsGenericMethod {

	WebDriver driver;

	public static void main(String[] args) throws Exception {
		SeleniumBasicCodeAsGenericMethod obj = new SeleniumBasicCodeAsGenericMethod();
//		obj.launchApplication("Chrome", "https://jqueryui.com/", 10);
		
		obj.launchApplicationUsingPropertyUrl("CHrome", 15);
	}

	public void launchApplication(String browserName, String url, long implicitWaitSeconds) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
			driver = new ChromeDriver();
		}

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\drivers\\edgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));

	}

	public void launchApplication2(String browserName, String url, long implicitWaitSeconds) {
		launchBrowser(browserName);

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));

	}
	
	public void launchApplication3(String browserName, String url, long implicitWaitSeconds) {
		launchBrowser1(browserName);
		maximizeBrowser();
		launchApplicationUrlWithImplicitWait(url, implicitWaitSeconds);

	}
	
	public void launchApplicationUsingPropertyUrl(String browserName, long implicitWaitSeconds) throws Exception {
		launchBrowser1(browserName);
		maximizeBrowser();
		launchApplicationUrlWithImplicitWait(PropertyFileReading.readApropertyAndReturnItsValue("url"), implicitWaitSeconds);

	}


	public void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
			driver = new ChromeDriver();
		}

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\drivers\\edgedriver.exe");
			driver = new EdgeDriver();
		}

	}
	
	

	public void launchBrowser1(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\drivers\\edgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
			driver = new ChromeDriver();
			break;
		}
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void launchApplicationUrlWithImplicitWait(String url, long seconds) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void getTitleOfTheCurrentPage() {
		driver.getTitle();
	}
	
	public void validatePageTitle(String expectedTitle) {
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("We are in the expected page");
		}
		else
			System.out.println("We are not in expected page");
	}
	
	public void assertPageTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

}
