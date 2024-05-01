package testNgPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters("name")
	public void printName(String name) {
		
		System.out.println("Name is " +name);
	}
}
