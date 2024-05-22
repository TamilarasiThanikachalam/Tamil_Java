package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingInputFromExcelUsingJXL {

	WebDriver driver = new ChromeDriver();
	
	public void loginUser(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TAMIL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userName =  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		userName.sendKeys(uName);
		
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		passWord.sendKeys(pWord);
		
	}
	
	public void gettingDataFromExcel() throws FileNotFoundException {
		FileInputStream excel = new FileInputStream("C:\\Users\\TAMIL\\OneDrive\\Desktop\\LoginData.xlsx");
//		workbook workBook = new workBook(excel);
	}
}
