package basicProgramPratice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Mithran";
//		reverseUsingSplit(str);
		reverseUsingToCharArray(str);

	}

	public static void reverseUsingSplit(String str) {
		String[] str1 = str.split("");
		for(int i=str1.length-1; i>=0;i--) {
			System.out.print(str1[i]);
		}
		
	}
	public static void reverseUsingToCharArray(String str) {
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
