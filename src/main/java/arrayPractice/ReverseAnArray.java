package arrayPractice;

import java.util.Scanner;

public class ReverseAnArray {
	static int[] arr = new int[5];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enetr the array values one by one  " + " ");
		for (int i = 0; i < arr.length; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		
		System.out.println("Elements of an array  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

//		System.out.println("Reverse An Array");

		sc.close();
		reverseAnGivenArray();

	}

	public static void reverseAnGivenArray() {

		System.out.println("Reversed An given Array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
