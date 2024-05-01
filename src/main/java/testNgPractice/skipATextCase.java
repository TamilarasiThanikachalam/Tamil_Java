package testNgPractice;

import org.testng.annotations.Test;

public class skipATextCase {
	
//	To skip a TC, we need to set the enabled attribute or parameter as "false" inside the @Test Annotations
//	By default it will have enabled = true
	
	@Test()
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	
	@Test(enabled = false)
	public void TurnOnTheMusic() {
		System.out.println("Turn on the Music");
	}
}
