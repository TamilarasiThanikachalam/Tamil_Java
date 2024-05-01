package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , 
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://accounts.google.com/v3/signin/identifier?hl=en_GB&ifkv=AaSxoQw4lJqg62YIsJILor7Gcf0O0-STRo5kfpowguxDNdgVDZZ_9t281c00Vn1jFKuK4pXpAHVwZw&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S604795670%3A1714205258333299&theme=mn&ddm=0");
//		driver.quit();
//		driver.close();
		
		driver.findElement(By.xpath("//*[@aria-label='Email or phone']")).sendKeys("thamizh996@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		

	}

}
