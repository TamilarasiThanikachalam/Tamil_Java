package arrayPractice;

public class PrintAnSortedArrayusingMethod {

	int[] arr = {22, 55, 88, 0};
	
	public static void main(String[] args) {
		PrintAnSortedArrayusingMethod Obj = new PrintAnSortedArrayusingMethod();
		Obj.sortAnArray();
	}
	
	public void sortAnArray() {
		System.out.println("***Before Sort***");
		PrintAnSortedArrayusingMethod Obj = new PrintAnSortedArrayusingMethod();
		Obj.printArray();
		
		for(int i = 0; i < arr.length; i++) {
			int temp;
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println("Iteration " +i);
			Obj.printArray();
		}
//		System.out.println(arr[i]);
		}
		
	
	
	public void printArray() {
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
