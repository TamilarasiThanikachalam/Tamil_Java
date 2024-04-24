package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	static WebDriver driver;
	static WebElement table;
	static int tableRows;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/LENOVO/Desktop/webTable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		table = driver.findElement(By.tagName("table"));
		tableRows = table.findElements(By.tagName("tr")).size();
		System.out.println(tableRows);
		
		WebTablePractice WTP = new WebTablePractice();
//		WTP.getAllHeadersFromTable(table);
//		getAllValuesFromARow(3);
		getAllRowIncludingHeaderRow(3);
		
//		validateGivenTextPresentInGivenRow(3, "700");
	}
	
	public void test() {

		// table[@name = 'Table']//tr[1]/th
		System.out.println("*************");
		System.out.println(driver.findElement(By.xpath("//table[@name = 'Table']//tr[1]/th")).getText());

		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println(table.findElement(By.tagName("tr")).getText());

		System.out.println("11111111111111111");
//		getAllValuesFromARow(3);
//		validateGivenTextPresentInGivenRow(3, "Chandler");

//		getAllValuesFromARowUsingForEach(0);

		getAllRowIncludingHeaderRow(2);

//		List<WebElement> allRows = table.findElements(By.tagName("tr"));
//		for (WebElement eachRow : allRows) {
//
//			List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
//			for(WebElement eachHeader: allHeaders) {
//				System.out.println(eachHeader.getText());
//			}
//
//			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
//			for (WebElement eachData : allData) {
//				System.out.println(eachData.getText());
//			}
//		}

	}

	public void getAllHeadersFromTable(WebElement tableElementName) {
		List<WebElement> allRows = tableElementName.findElements(By.tagName("tr"));
		for (WebElement eachRow : allRows) {
			List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
			for (WebElement eachHeader : allHeaders) {
				System.out.println(eachHeader.getText());
			}
		}
	}

	// https://www.geeksforgeeks.org/how-to-handle-dynamic-web-tables-using-selenium-webdriver-in-java/
	public static void getAllValuesFromARow(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allData = rowText.get(i).findElements(By.tagName("td"));
				for (WebElement eachData : allData) {
					System.out.println(eachData.getText());
				}
				break;
			}
		}
	}

	public static void getAllValuesFromARowUsingForEach(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == row) {
				List<WebElement> allData = eachRow.findElements(By.tagName("td"));
				for (WebElement eachData : allData) {
					System.out.println(eachData.getText());
				}
				break;
			}
			temp++;
		}
	}

	public static void getAllRowIncludingHeaderRow(int row) {
		HashMap<String, String> map = new HashMap<String, String>();
		String key = null;
		String value = null;
		ArrayList<String> headerList = new ArrayList<String>();
		ArrayList<String> givenRowList = new ArrayList<String>();
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == 0) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println("Headers in table are " + eachHeader.getText());
					headerList.add(eachHeader.getText());
				}
//				break;
			}
			if (temp == row) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println(eachHeader.getText());
					givenRowList.add(eachHeader.getText());
				}
			}
			temp++;
		}
		System.out.println(headerList);
		System.out.println(givenRowList);
//		map.put(key, value);
		
		for(int i =0; i<headerList.size(); i++) {
			map.put(headerList.get(i), givenRowList.get(i));
		}
		
		System.out.println(map);
	}

	public static void validateGivenTextPresentInGivenRow(int row, String text) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allData = rowText.get(i).findElements(By.tagName("td"));
				for (WebElement eachData : allData) {
					if (eachData.getText().equalsIgnoreCase(text)) {
						System.out.println(eachData.getText());
						int rowNum = i+1;
						System.out.println(driver.findElement(By.xpath("//table[@name = 'Table']//tr["+rowNum+"]/td[1]")).getText());
					}
				}
			}
		}
	}
}
