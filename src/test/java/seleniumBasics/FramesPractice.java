package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h1[contains(text(), 'HTML Dropdowns')]")));

		driver.findElement(By.id("iFrame")).click();
		Thread.sleep(5000);
//		driver.findElement(By.id("current_filter")).click();

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		System.out.println(driver.findElements(By.tagName("frame")).size());

//		driver.switchTo().frame(3);
//		driver.switchTo().frame("globalSqa");
		WebElement iframeSection = driver
				.findElement(By.xpath("//*[@data-src='https://www.globalsqa.com/trainings/']"));
		driver.switchTo().frame(iframeSection);
//		driver.switchTo().frame(driver.findElement(By.name("globalSqa")));
		driver.findElement(By.name("s")).click();
		driver.findElement(By.name("s")).sendKeys("Hello");
//		driver.findElement(By.id("Open New Window")).click();

////		System.out.println(driver.findElement(By.xpath("//div[text() = '+91-9910979218' and @class = 'header_phone']")).getText());
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("Open New Window")).click();

//		http://www.maths.surrey.ac.uk/explore/nigelspages/framenest.htm
	}

	public int noOfiFramesInWebPage() {
		int noOfiFramesdriver = driver.findElements(By.tagName("iframe")).size();
		return noOfiFramesdriver;
	}

	public void switchToFrameByIndex(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	public void switchToParentWindow() {
		driver.switchTo().parentFrame();
	}

	public void switchToMainWebPage() {
		driver.switchTo().defaultContent();
	}
	
	public void clickAnElement(WebElement ele) {
		ele.click();
	}

}
