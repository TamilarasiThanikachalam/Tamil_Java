
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import utilities.CommonMethods;

public class CovertingToMethods {
	
	static WebDriver driver;
//	CommonMethods commonMethods = new CommonMethods();

	public static void main(String[] args) throws Exception {
		CovertingToMethods obj = new CovertingToMethods();
		obj.facebookLogin();
		obj.OpenBrowserWithParameter("Chrome");
	}
	
	public void facebookLogin() throws Exception {
		browserLaunch();
		maximizeBrowserWindow();
//		launchApplication("https://en-gb.facebook.com/");
		launchApplicationUsingProp();
		loginFacebook1("sathya08ece@gmail.com", "TestSathya@123");
	}
	
	public void instagramLogin() {
		browserLaunch();
		maximizeBrowserWindow();
		launchApplication("https://en-gb.facebook.com/");
//		loginFacebook1("sathya08ece@gmail.com", "TestSathya@123");
	}
	
	
	
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id("email")).sendKeys("Sathya08ece@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TestSathya@123");
		driver.findElement(By.name("login")).click();

	}
	
	public void OpenBrowserWithParameter(String browserName) {
		switch(browserName) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
				driver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\geckodriver.exe");
				driver = new ChromeDriver();
				break;
		}
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id("email")).sendKeys("Sathya08ece@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TestSathya@123");
		driver.findElement(By.name("login")).click();
	}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		driver = new ChromeDriver();
	}
	
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	
	public void launchBrowserAndMaximizeWindow() {
		browserLaunch();
		maximizeBrowserWindow();
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}
	
	public void launchApplicationUsingProp() throws Exception {
//		driver.get("facebook.com");
//		driver.get(commonMethods.readAndReturnProperty("facebookURL"));
	}
	
	public void loginFacebook1(String userName, String pass) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}
}

