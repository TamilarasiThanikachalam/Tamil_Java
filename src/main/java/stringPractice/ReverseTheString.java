package stringPractice;

public class ReverseTheString {

	public static void main(String[] args) {
//		reverseString3();
		reverseString4();

	}
	
	public static void reverseString3() {
		String str = "Sathya";
		
		String[] str1 = str.split("");
		System.out.println("Original String" +'\n' +str );
		
//		for(String eachString:str1) {
//			System.out.println(eachString);
//		}
		System.out.println("Reversed String");
		for(int i=str1.length-1; i>=0; i--) {
			System.out.print(str1[i]);
		}
	}
	public static void reverseString1() {
		String str = "Mithran";
		
		System.out.println("Original String: " +str);
		String str1 = "";
		char str2 ;
		for (int i=0; i<str.length();i++) {
		str2 = str.charAt(i);
		
		str1 = str2 + str1;
		}
		System.out.println("Reversed string: " +str1);
	}
	
	public static void reverseString2() {
		String str = "Sathya";
		System.out.println("Original String: " +str);
		char[] results = str.toCharArray();
		
		System.out.print("Reversed String: ");
		for(int i = results.length-1; i>=0; i--) {
			System.out.print(results[i]);
		}
	}
	public static void reverseString4() {
		
		String str = "Mithran";
//		String ch= "";
		
		String[] str2 = str.split("");
		
		for(int i=str2.length-1; i>=0; i--) {
//			ch = ch + str2[i];
//			System.out.println(ch);
			System.out.print(str2[i]);
		}
//		System.out.println(ch);
//		return ch;
	}

}
