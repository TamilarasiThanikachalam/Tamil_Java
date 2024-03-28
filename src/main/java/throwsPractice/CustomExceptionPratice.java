package throwsPractice;

import java.util.Scanner;

public class CustomExceptionPratice extends Exception{

	public CustomExceptionPratice(int age) {
		
		System.out.println("Age is less than 18, not eligible for voting");
	}
	
	public static void main(String[] args) throws CustomExceptionPratice {
		
//		int age = 14;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		
		if(age < 18 ) {
			throw new CustomExceptionPratice(14);
			
		}
	}
}
