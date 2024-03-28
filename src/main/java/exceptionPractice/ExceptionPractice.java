package exceptionPractice;

import java.util.Scanner;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		try {
			for(int i = 0; i < 8; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		catch (Exception e) {
			System.out.println("Parent Exception Class");
		}
		finally {
			System.out.println("Exception captured");
		}
//		System.out.println("No Excpetion occuered");
	}
	
	
}
