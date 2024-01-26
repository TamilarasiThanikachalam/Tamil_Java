package throwException;

import org.openqa.selenium.firefox.UnableToCreateProfileException;

public class JavaException extends Exception{

	public static void main(String[] args) {
		try {
			System.out.println("Testing Runtime Excpetion");
			throw new UnableToCreateProfileException("Cannot Create new Profile");
		}
		catch (UnableToCreateProfileException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter a Valid Aadhar number");
		}
//		catch (Exception r) {
//			System.out.println("Enter a correct OTP for the Aadhar Verification");
//		}

	}
	class CustomException{
		
	}

}
