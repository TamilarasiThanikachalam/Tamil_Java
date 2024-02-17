package arrayPractice;

import java.util.Scanner;

public class GettingInputFromUser {

	public static void main(String[] args) {

		int arr1[] = { 10, 2, 3, 8 };
//		printAnArray(arr1);
//		GettingInputFromUser Obj = new GettingInputFromUser();

//		int[] userArray = getArrayFromUser(3);
//		printAnArray(userArray);
//		reverseAnArray(userArray);
//		sortAnArray(userArray);

		smallestOrBiggestNumberOfAnyArray(arr1, "big");
		smallestOrBiggestNumberOfAnyArray(arr1, "Small");

//		getArrayFromUser();

	}

	public static void printAnArray(int a1[]) {
		System.out.println("Elements of an array:");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}

	public static int[] getArrayFromUser(int arraysize) {
		Scanner sc = new Scanner(System.in);
//		int arraysize = 0;
//		System.out.println("Enter the Size of an Array:");
//		arraysize = sc.nextInt();
//		
		int[] arr = new int[arraysize];
		System.out.println("Enter the " + arraysize + " Elements of an Array:");
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static void getArrayFromUser() {
		Scanner sc = new Scanner(System.in);
		int arraysize = 0;
		System.out.println("Enter the " + arraysize + " Elements of an Array:");
		arraysize = sc.nextInt();

		int[] arr = new int[arraysize];
		System.out.println("Enter the Elements of an Array:");
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();
		}
		printAnArray(arr);
		sc.close();

	}

	public static void reverseAnArray(int ar1[]) {
		System.out.println("Reversed Array");
		for (int i = ar1.length - 1; i >= 0; i--) {
			System.out.println(ar1[i]);
		}
	}

	public static void sortAnArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("Sorted array is ");
		printAnArray(arr);
	}

	public static void biggestNumberOfAnyArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
//		int len= arr.length-1;
//		System.out.println("Biggest Number in the given array is " +arr[len]);
		System.out.println("Biggest Number in the given array is " + arr[arr.length - 1]);
	}

	public static void smallestNumberOfAnyArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
//		int len= arr.length-1;
		System.out.println("Smallest Number in the given array is " + arr[0]);
	}

	public static void smallestOrBiggestNumberOfAnyArray(int arr[], String bigOrSmall) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		switch (bigOrSmall) {
		case "Small":
			System.out.println("Smallest Number in the given array is " + arr[0]);
			break;

		case "Big":
			System.out.println("Biggest Number in the given array is " + arr[arr.length - 1]);
			break;
		}

		if(bigOrSmall.equalsIgnoreCase("Big"))
//		if (bigOrSmall.equals("Big"))
			System.out.println("Biggest Number in the given array is " + arr[arr.length - 1]);
		else
			System.out.println("Smallest Number in the given array is " + arr[0]);
	}
	
	

}
