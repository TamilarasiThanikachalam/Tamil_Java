package arrayClass;

import java.util.Arrays;

public class BinarySerach {

	public static void main(String[] args) {
		char[] ch = {'a', 'b', 'd'}; // a, b, c, d, e, f, g
		
		int arr[] = {5, 6, 3, 2, 7, 9};
		
		System.out.println("*****Binary Serach*****");
		System.out.println("Array Index of a " +Arrays.binarySearch(ch, 'a'));
		System.out.println("Array Index of f " +Arrays.binarySearch(ch, 'f'));// a-0, b-1, d-3, f-4, g-5 --->5-1 = -4
		System.out.println("Array Index of c " +Arrays.binarySearch(ch, 'c'));// a-0, b-1, c-3,d-4 ---> 4-1 = -3
	
		
		System.out.println("*****Binary serach using Range*****");
		System.out.println("Array Index of int array 6 is " +Arrays.binarySearch(arr, 0, 5, 6)); //6-1 = -5
		System.out.println("Array Index of int array 2 is " +Arrays.binarySearch(arr, 0, 3, 2)); //2-1 = -1
		System.out.println("Array Index of int array 4 is " +Arrays.binarySearch(arr, 1, 5, 4)); //******
		
		
		

	}

}
