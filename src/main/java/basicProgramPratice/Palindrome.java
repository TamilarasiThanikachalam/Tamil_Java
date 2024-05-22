package basicProgramPratice;

import org.testng.annotations.Test;

public class Palindrome {

//	Using String  - charAt() method	
//	@Test
//	public void stringPalindrome() {
//		String str = "MALAYALAM";
//		
//		String rev = "";
//		
//		for(int i = str.length() - 1; i >=0; i--) {
//		rev = rev + str.charAt(i);
//		}
//		if(rev.equals(str)) {
//			System.out.println("Given string is Palindrome");
//			
//		}
//		else {
//			System.out.println("Given string is not a palindrome");
//		}
//
//	}
	
//	Using split() method()
	@Test
	public void palidromeStringBuffer() {
		String str = "abba";
		 
		StringBuffer buff = new StringBuffer(str);
		StringBuffer buff2 = new StringBuffer();
		buff2 = buff.reverse();
		if((buff.reverse()).equals(buff2)) {
			System.out.println("Given string is Palindrome");
			
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		
		
	}
	
}
