package basicProgramPratice;

public class SortAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,0,5,2,8,16,3};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>=arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
