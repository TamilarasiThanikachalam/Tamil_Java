package arrayParctice;

public class ProcessingArray {

	public static void main(String[] args) {
		int[] newArr = { 10, 50, 30, 5, 2 };

		additionOfArray(newArr);
		// 2 2 2 5
	}

	public static void additionOfArray(int[] arr) {
		int temp = 0;
		for(int i = 0; i<arr.length-1; i++) {
			temp = arr[i] + temp;
//			i = i+2;
		}
		System.out.println("total of the array is "+ temp);
	}
	
	/* Sort an array
	 * reverse an array
	 * find duplicates in an array
	 * count duplicates in an array
	 */

}