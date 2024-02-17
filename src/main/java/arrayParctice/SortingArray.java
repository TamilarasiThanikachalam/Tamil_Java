package arrayParctice;

public class SortingArray {

	public static void main(String[] args) {
//		sortArray2();
		
		int[] newArr = { 10, 50, 32, 5, 2 };
		sortAnArray3(newArr);
	}

	public static void sortArray2() {

		int[] arr = { 10, 50, 32, 5, 2 };
		
		System.out.println("Original array");
		printAnIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j]; // arr[i] = 5;
					arr[j] = temp;
				}
			}
//			System.out.println(arr[i]);
			System.out.println("After iteration "+i+ "*************");
			printAnIntArray(arr);
			
		}
//		printAnIntArray(arr);
		int val = arr.length-1;
		System.out.println("Biggest number in the array is "+arr[val]);
		System.out.println("Smallest number in the array is "+arr[0]);
	}
	
	public static void sortAnArray3(int arr[]) {
		System.out.println("Original array");
		printAnIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j]; // arr[i] = 5;
					arr[j] = temp;
				}
			}
//			System.out.println("Sorted array is ");
//			System.out.println(arr[i]);
		}
		System.out.println("Sorted array is ");
		printAnIntArray(arr);
	}

	public static void printAnIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void sortArray1() {

		int[] arr = { 10, 50, 32, 5, 2 };

//		System.out.println(arr[3]);

		for (int i = 0; i < arr.length; i++) {
			int temp;
			System.out.println(arr[i]);
//			for(int j = 0; j<arr.length; j++) {
			for (int j = i + 1; j < arr.length; j++) {
//			System.out.println(arr[j]);
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j]; // arr[i] = 5;
					arr[j] = temp;
				}
				System.out.println(arr[i] + "***********");
			}
			System.out.println(arr[i]);
		}

	}
}
