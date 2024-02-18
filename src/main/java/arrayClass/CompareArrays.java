package arrayClass;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 7, 9};
		int arr1[] = {1, 2, 5, 7, 9};
		int arr2[] = {1, 5, 7, 2, 9};
		
		boolean compareTwoArrays = Arrays.equals(arr, arr1);
		System.out.println(compareTwoArrays);
		
		System.out.println(Arrays.compare(arr2, arr1));
		System.out.println(Arrays.compare(arr1, arr2));
		
	}

}
