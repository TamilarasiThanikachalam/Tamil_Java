// * throw keyword we uses to throw an exception voluntarily which we predict during compile time itself
// * Whenever we throw an exception, the method associated needs to have throws keyword followed by respective Exception(eg: IOException)
//		or its super class(Exception).
// * We generally use throw keyword to throw custom created exceptions
// * All other exceptions except Runtime exceptions can be threw during compile time.
//		* means, we can not throw Exception which extends to RunTimeException class. 
//		* RunTimeExceptions need to be dealt with try catch blocks

//if we throw RunTime exception voluntarily, we dont need to add 'throws'

// Throwable is parent class of Exceptions and Errors;

package throwException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Throws {

//		public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//	public static void main(String[] args) throws IOException, ClassNotFoundException {
//	public static void main(String[] args) throws IOException, Exception, ClassNotFoundException {
//	public static void main(String[] args) {
	public static void main(String[] args) throws Exception {
		

//		throw new IOException();
//		System.out.println("hello");

//		throw new ClassNotFoundException();

//		throw new SQLException();

//		throw new ArithmeticException();

//		method1();
//		throw new ClassNotFoundException();

		method3();

//		Throws obj = new Throws();
		
//		method4();
		
//		method41();
//		method42();

	}

	public static void method1() throws IOException {
		throw new IOException();

//		System.out.println("I am method1");
	}

	public static void method2() throws Exception {
		method1();
	}
	
	public static void method4() {
//		throw new ArithmeticException();
		int a = 10/0;
	}
	
	public static void method41() {
		
		try {
//		int a = 10/0;        //--> System throws Arithmatic Exception with message "/ by Zero"
		throw new ArithmeticException();       //---> We voluntarily throw Arithmatic Exception. So there is no message
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
	}
		
		public static void method42() {
//		if we need 'a' value for some other process, we can not skip it because of exception
		
		int a;
		try {
			a = 10/2;
//			throw new ArithmeticException();
			}
			catch(ArithmeticException e) {
				a = 10;
				System.out.println(e.getMessage());
			}
		
		int c = a + a;
		System.out.println(c);
		
	}

	public static void method3() {
		System.out.println("hello");
		WebDriver driver = new ChromeDriver();
		driver.findElement(null);
//		NoSuchElementException
//		ElementNotInteractableException;
	}
	

}
