package testNgPractice;

import org.testng.annotations.Test;

public class SetPriority {

//	To set the order of execution or priority on which TC should run first or in which order, 
//	we use (Parameter or Attribute)priority = int inside the @Test Annotation
	
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("Put First Gear");
	}
	
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Put Second Gear");
	}
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Put Third Gear");
	}
	
	@Test(priority = 4)
	public void putForthGear() {
		System.out.println("Put Fourth Gear");
	}
}
