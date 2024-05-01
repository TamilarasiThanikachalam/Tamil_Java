package testNgPractice;

import org.testng.annotations.Test;

public class GroupingPractice {
	
	@Test(groups = {"fruits"})
	public void mango() {
		System.out.println("Fruits");
	}
	
	@Test(groups = {"fruits"})
	public void apple() {
		System.out.println("Vegetables");
	}
	
	@Test(groups = {"vehicle"})
	public void cars() {
		System.out.println("Cars");
	}
	
	@Test(groups = {"vehicle"})
	public void bike() {
		System.out.println("Bike");
	}

}
