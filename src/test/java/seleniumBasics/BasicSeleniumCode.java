package seleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicSeleniumCode {
	
	public void Test() {
		WebDriver driver  = new ChromeDriver();
		
		By obj1 = By.className("");
		WebElement ele = driver.findElement(obj1);
		ele.click();
		
		driver.findElement(By.className("")).click();
		driver.findElement(By.id("")).sendKeys();
		
	}

	public static void main(String[] args) throws Exception {
//		C:\Users\LENOVO\git\Class\JavaPractice\src\test\resources\drivers\chromedriver_114.exe
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Class\\JavaPractice\\src\\test\\resources\\drivers\\chromedriver_114.exe");
//		System.out.println(System.getProperty("user.dir"));
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String loginText = driver.findElement(By.xpath("//h5[text() = 'Login']")).getText();
		
		if(loginText.equals("Login")) {
			System.out.println("We are on login page");
		}
		
		
		Assert.assertEquals(loginText, "Login");
		
		System.out.println("Testing is continuing");
		
//		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		WebElement login_Text = driver.findElement(By.xpath("//h5[text() = 'Login']"));
		
//		Assert.assertTrue(login_Text.isDisplayed());
		
		Thread.sleep(5000);
		
//		driver.close();
		driver.quit();
	}
	
	
	
	
	public void testMethod1() {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_107.exe");
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

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
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
		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h5[text() = 'Elements']")));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
		
		driver.close();
		
	}

}
