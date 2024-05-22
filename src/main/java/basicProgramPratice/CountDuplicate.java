package basicProgramPratice;

public class CountDuplicate {

	public static void main(String[] args) {
		String str = "java";
		
		String[] str1 = str.split("");
		for(int i=0; i<str1.length; i++) {
			
		}
		int count = 0;
		for(int i = 0; i< str1.length-1;i++) {
			for(int j=i+1; j<str1.length-1;j++) {
				if(str1[i].equals(str1[j])) {
					System.out.println(str1[i]);
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
