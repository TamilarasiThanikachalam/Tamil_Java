package arrayPractice;

import java.util.Scanner;

public class ArrayProcessingUsingDynamicMethod {

	int arr[] = { 67, 45, 23, 54, 10 };
	static int arr1[] = { 11, 55, 23, 11, 23, 67, 23 };

	public static void main(String[] args) {
		ArrayProcessingUsingDynamicMethod Obj = new ArrayProcessingUsingDynamicMethod();
		int[] userArray = getInputFromUser();
		Obj.printAnyArray(userArray);
		int[] sort = sortAnyArray(userArray);
		System.out.println("Sorted Array");
		Obj.printAnyArray(sort);
		reverseAnyArray(userArray);
		
		printBiggestOrSmallestElementOfAnyArray(userArray);
		
//		EqualIgnorecase is used - no case sensitive
		Obj.findGivenArrayBigOrSmall(userArray, "big");
//		Equal is used hence case sensitive - no output
		Obj.findGivenArrayBigOrSmall(userArray, "small");
//		Equal is used hence case sensitive 		
		Obj.findGivenArrayBigOrSmall(userArray, "Small");

//		Obj.findGivenArrayBigOrSmall(arr1, "Big");
		
//		Obj.findSameOccurenceInAnyArray(arr1);
	}

	public static int[] getInputFromUser() {

		Scanner sc = new Scanner(System.in);
		int arraySize = 0;
		System.out.println("Enter the size of an Array");
		arraySize = sc.nextInt();

		int ar1[] = new int[arraySize];
		System.out.println("Enter the " + arraySize + " Elements of an Array one by one");
		for (int i = 0; i < arraySize; i++) {
			ar1[i] = sc.nextInt();
			}
    	sc.close();
		return ar1;
	}

	public static int[] sortAnyArray(int ar[]) {

		int temp;
//		System.out.println("Sorted Array");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
		}
		return ar;

	}

	public void findSameOccurenceInAnyArray(int ar[]) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
					count++;
				}
			}
			System.out.println(ar[i]);
			System.out.println(count);
		}

	}

	public static void reverseAnyArray(int ar[]) {
		System.out.println("Reversed Array are:");
		for (int i = ar.length-1; i >= 0; i--) {
			System.out.println(ar[i]);
		}
	}

	public static void printBiggestOrSmallestElementOfAnyArray(int ar[]) {
		sortAnyArray(ar);
		System.out.println("Biggest element of an array " + ar[ar.length - 1]);
		System.out.println("Smallest element of an array " + ar[0]);
	}

	public void findGivenArrayBigOrSmall(int ar[], String BigOrSmall) {
		sortAnyArray(ar);
		if (BigOrSmall.equalsIgnoreCase("Big")) {
			System.out.println("Biggest element of an array " + ar[ar.length - 1]);
		}
		if (BigOrSmall.equals("Small")) {
			System.out.println("Smallest element of an array " + ar[0]);
		}
	}

	public void printAnyArray(int ar[]) {
		System.out.println("Elements of an Array");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
