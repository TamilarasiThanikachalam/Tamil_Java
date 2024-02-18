package arrayClass;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int arr[] = {23,10,45,2,96,34};
		char[] ch = {'z', 'f', 'E', 'W'};
		String str[] = {"xyz", "hij", "abc"};
		
//		Arrays.sort(arr);
//		printAnyArray(arr);
//		System.out.println("Sorting the entire Int Array " +Arrays.toString(arr));
		Arrays.sort(arr, 2, 4);
		printAnyArray(arr);
//		System.out.println("Sorting arrays in the specified range " +Arrays.toString(arr));
//		Arrays.sort(ch);
//		System.out.println("Sorting the Entire Char Array " +Arrays.toString(ch));
		Arrays.sort(ch, 1, 3);
		printAnyArray(ch);
//		System.out.println("Sorting the Entire Char Array " +Arrays.toString(ch));
		
		Arrays.sort(str);
		System.out.println("Sorting the String Array ");
		for(String eachvalue : str) {
		System.out.println(eachvalue);
		}
	

	}
	public static void printAnyArray(int ar[]) {
		System.out.println("Arrays: ");
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void printAnyArray(char ar[]) {
		System.out.println("Arrays: ");
		for(char i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
