package arrayPractice;

public class SortAnArrayPractice {

	public static void main(String[] args) {
		sortAnIntArray();

	}

	public static void sortAnIntArray() {

		int arr[] = { 67, 45, 34, 2 };
		System.out.println("*****Before Sorting*****");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		System.out.println("*****After Sorting*****");

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// System.out.println(arr[i]);
//			System.out.println("*****After Sorting*****");
			}
// This Sysout will just print the final sorted array alone
			System.out.println(arr[i]);

// If using this for loop, each iteration of sorting the array will be printed
//			for (int k = 0; k < arr.length; k++) {
//				System.out.println(arr[k]);
//			}

		}

	}

}
