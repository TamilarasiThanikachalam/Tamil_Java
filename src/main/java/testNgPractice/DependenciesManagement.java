package testNgPractice;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test
	
	
	
	
	
//	@Test(enabled = false)
	public void loginUser() {
		System.out.println("Login to amazon.com");
	}
	
	@Test(dependsOnMethods = "loginUser")
	public void addProduct() {
		System.out.println("Add product to the cart");
	}
	
	@Test(dependsOnMethods = "addProduct")
	public void payBill() {
		System.out.println("Pay Bill");
	}
	
}
