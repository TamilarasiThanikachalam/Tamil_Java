package multiDimArray;

import java.util.Scanner;

public class MultiArrayDeclaration {

//	* Nested arrays are nothing but multi dimentional array
//	* 2D array - array of arrays
//	* 3D array - array of 2D arrays
//	* In Multi dimentional array, length is nothing but "row size".
//	* To print multidimentional array, we rely on for loops. We can not use simple sysout and Arrays class methods
//	* While printing multi-dimentional/jagged array using for loop, column size is rely on row of array. check lines 59 and 60

	public static void main(String[] args) {
		test();
	}

	public static void print2DArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public static void test() {

//		Single Dimentional array
		int arr1[] = { 1, 3, 5, 6 };
		int arr2[] = new int[] { 3, 5, 4, 1 };
		int arr4[] = arr2.clone();

//		Two dimentional array
		int arr3[][] = { arr1, arr2, arr4 }; // { {1, 3, 5, 6}, {3, 5, 4, 1}, {3, 5, 4, 1}}

		int arr61[][] = { { 1, 3, 5, 6 }, { 3, 5, 4, 1 }, { 3, 5, 4, 1 } };

		int arr7[][] = new int[2][2];
//		arr7 = {{2, 3}, {4, 5} };
		arr7[0][0] = 2;
		arr7[0][1] = 3;
		arr7[1][0] = 4;
		arr7[1][1] = 5;
		
//		1356
//		3541
//		3541
		
		System.out.println("Print array values");
		print2DArray(arr7);
		System.out.println("****************");

//		Find length of array
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("********Two Dimentional array length*******");
		System.out.println(arr3.length);
		System.out.println(arr61.length);
		System.out.println(arr3[0].length);

//		How to get a specific value of a 2D array
		System.out.println(arr3[2][3]);
		System.out.println(arr3[0][0]);

		int arr5[][] = new int[2][3];
		arr5[0][0] = 2;
		arr5[0][1] = 3;
		arr5[0][2] = 5;
		arr5[1][0] = 6;
		arr5[1][1] = 9;
		arr5[1][2] = 0;
		System.out.println(arr5.length);

//		Getting array value from user
		int rowSize = 2, columnSize = 2;
		int arr6[][] = new int[rowSize][columnSize];
//		int arr6[][] = new int[2][2];
		System.out.println("Please enter a matrix with " + rowSize + " rows and " + columnSize + " columns");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				arr6[i][j] = scan.nextInt();
			}
		}
		print2DArray(arr6);
	
	}
}
