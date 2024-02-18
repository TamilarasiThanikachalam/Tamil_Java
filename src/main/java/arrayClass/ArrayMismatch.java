package arrayClass;

import java.util.Arrays;

public class ArrayMismatch {

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 7, 9};
		int arr1[] = {1, 2, 5, 7, 9};
		int arr2[] = {1, 5, 7, 2, 9};
		
		System.out.println(Arrays.mismatch(arr, arr1));
		System.out.println(Arrays.mismatch(arr1, arr2));

	}

}
