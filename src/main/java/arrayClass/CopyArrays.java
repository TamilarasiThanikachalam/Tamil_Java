package arrayClass;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		int arr1[] = Arrays.copyOf(arr, 4);
		printAnyArray(arr1);
//		System.out.println("Copied Array");
//		for(int eachVal : arr1) {
//			System.out.println(eachVal);
//		}
		
		int arr2[] = Arrays.copyOfRange(arr, 1, 4);
		printAnyArray(arr2);

	}

	public static void printAnyArray(int ar[]) {
		System.out.println("Copied Array");
		for (int eachVal : ar) {
			System.out.println(eachVal);
		}
	}
}
