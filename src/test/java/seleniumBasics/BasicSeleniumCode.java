package seleniumBasics;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ReadingFromPropertyFile.ReadFromProperty;

public class BasicSeleniumCode {

	public static String browserName1 = "Chrome";

	public void Test() {
//		RemoteWebDriver;
//		WebDriver driver  = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();

		By obj1 = By.className("");
		WebElement ele = driver.findElement(obj1);
		ele.click();

		driver.findElement(By.className("")).click();
		driver.findElement(By.id("")).sendKeys();

	}

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> pref = new LinkedHashMap<>();
//		pref.put("profile.default_content_settings.popups", 0);
		options.addArguments("--disable-notifications");
		pref.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", pref);

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);

//		driver.findElement(By.xpath("//a[text() = \"About\"]"));
		WebElement link_About = driver.findElement(By.xpath("//a[text() = 'About']"));
		System.out.println(link_About.isDisplayed());
		System.out.println(link_About.isEnabled());
		System.out.println(link_About.isSelected());

		System.out.println(link_About.getAttribute("id"));
		System.out.println(link_About.getAttribute("href"));

		System.out.println(link_About.getDomProperty("id"));
		System.out.println(link_About.getDomProperty("href"));

		if (titleOfThePage.equalsIgnoreCase("jQuery UI")) {
			System.out.println("We are in correct page!");
		} else
			System.out.println("Oops! We are in a wrong page!!!");

//		System.out.println(link_About.getText());

//		driver.findElement(By.xpath("//a[text() = 'Demos']")).click();
//		driver.getTitle();
//		WebElement link_Blog = driver.findElement(By.xpath("//a[text() = 'Blog']"));
//		link_Blog.click();
//		driver.getTitle();

		Thread.sleep(10);

		List<WebElement> menuLinks = driver.findElements(By.xpath("//ul[@id = 'menu-top']//li/a"));
		for (WebElement eachMenu : menuLinks) {
			System.out.println(eachMenu.getText());
//			BSC.waitForElementToBeClickable(eachMenu, 60);
			Thread.sleep(3);
			eachMenu.click();
		}

//		driver.close();
	}

	public void waitForElementToBeClickable(WebElement ele, long seconds) {
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		explicitWait.until(ExpectedConditions.elementToBeClickable(ele));
	}

//	public void  waitForElementToBeClickable(WebElement ele, long seconds) {
//		WebDriverWait explicitWait = new  WebDriverWait(driver, Duration.ofSeconds(seconds));
//		explicitWait.until(ExpectedConditions.elementSelectionStateToBe(ele));
//	}

//	public Duration testDurationParameter() {
//		Duration dur = Duration.ofSeconds(0);
//		return dur;
//		
//	}

//	obj.openBrowser("Chrome");
//	obj.openBrowser("chrome");
//	obj.openBrowser("CHROME");

	public void openBrowser(String browserName) {
		WebDriver driver = null;
//		browserName = browserName.toLowerCase();
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "FirefoxDriver.exe path to be mentioned here");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "EdgeDriver.exe path to be mentioned here");
			driver = new EdgeDriver();
			break;
		}

		driver.manage().window().maximize();
	}

	public void openBrowser() throws Exception {
		WebDriver driver = null;
		ReadFromProperty readProp = new ReadFromProperty();
		String browserName = readProp.getAProperty("browerName");

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "FirefoxDriver.exe path to be mentioned here");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "EdgeDriver.exe path to be mentioned here");
			driver = new EdgeDriver();
			break;
		}

		driver.manage().window().maximize();
	}

	public void openBrowser1() throws Exception {
		WebDriver driver = null;
		switch (browserName1.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "FirefoxDriver.exe path to be mentioned here");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "EdgeDriver.exe path to be mentioned here");
			driver = new EdgeDriver();
			break;
		}

		driver.manage().window().maximize();
	}

	public void openApplication(String browserName, String url, long implicitWaitSeconds) throws Exception {

		WebDriver driver = null;
		ReadFromProperty readProp = new ReadFromProperty();
		browserName = readProp.getAProperty("browerName");

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "FirefoxDriver.exe path to be mentioned here");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "EdgeDriver.exe path to be mentioned here");
			driver = new EdgeDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
	}

	public void seleniumBasic() {

//		C:\Users\LENOVO\git\Tamil_Java\src\test\resources\drivers\chromedriver_125.exe
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Tamil_Java\\src\\test\\resources\\drivers\\chromedriver_125.exe");
//		System.out.println(System.getProperty("user.dir"));
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver_114.exe");

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(testDurationParameter());

//		WebDriver methods

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);

//		System.out.println(driver.getPageSource());

		WebElement link_jQueryHeader = driver.findElement(By.xpath("//a[@href = 'https://jquery.com/']"));
		link_jQueryHeader.click();

//		link_SupportHeader_chat; --recommended
//		headerLink_Support_Chat;

	}

	public void test123() throws InterruptedException {

		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();

		System.out.println(((RemoteWebDriver) driver).getSessionId());

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String loginText = driver.findElement(By.xpath("//h5[text() = 'Login']")).getText();

		if (loginText.equals("Login")) {
			System.out.println("We are on login page");
		}

//		Assert.assertEquals(loginText, "Login");

		System.out.println("Testing is continuing");

//		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		WebElement login_Text = driver.findElement(By.xpath("//h5[text() = 'Login']"));

//		Assert.assertTrue(login_Text.isDisplayed());

		Thread.sleep(5000);

//		driver.close();
		driver.quit();
	}

	public void testMethod1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.getCurrentUrl());

		String title = driver.getTitle();
		System.out.println(title);

		System.out.println(driver.getPageSource());

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);

		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();

		boolean elementIsDisplayed = driver.findElement(By.xpath("//h5[text() = 'Elements']")).isDisplayed();
		System.out.println(elementIsDisplayed);

		driver.close();

	}

	public void testMethod() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.getTitle());

		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		System.out.println(driver.getWindowHandle());
//		CDwindow-5F1CA225F06ACB8FC7F1BF3149B579F1

		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();

		boolean elementIsDisplayed = driver.findElement(By.xpath("//h5[text() = 'Elements']")).isDisplayed();
		System.out.println(elementIsDisplayed);

		WebElement element1 = driver.findElement(By.xpath("//h5[text() = 'Elements']"));
//		element1.

//		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//h5[text() = 'Elements']")));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();

		driver.close();

	}

}
