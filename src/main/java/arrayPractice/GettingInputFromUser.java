package arrayPractice;

import java.util.Scanner;

public class GettingInputFromUser extends PrintAnSortedArrayusingMethod{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int arraysize = 0;
		System.out.println("Enter the Size of an Array:");
		if(sc.hasNextInt()) {
			arraysize = sc.nextInt();
		}
		int arr[] = new int[arraysize];
		System.out.println("Enter the Elements of an Array:");
		for(int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of an array:");
		for(int i =0; i < arraysize; i++) {
			System.out.println(+arr[i]);
		}
	
	}

}
