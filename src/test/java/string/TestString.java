package string;

public class TestString {

	public static void main(String[] args) {
		String str = "Tamilarasi.; Tamilarasi";
//		String[] arr  = str.split("la");
		String[] arr = str.split(" ");

		System.out.println(arr.length);
		for (String each : arr) {
			System.out.println(each);
		}
		
		String str1 = "Tamilarasi";
		char[] arr1 = str1.toCharArray();
		
		System.out.println(arr1.length);
		for (char each : arr1) {
			System.out.println(each);
		}
		
	}

	public static void method1() {

		String str = "Vinothini";

		String[] allString = str.split("");

		for (String eachString : allString) {
			System.out.println(eachString);
		}

		char[] eachChar1 = str.toCharArray();

		for (char each : eachChar1) {
			System.out.println(each);
		}

		System.out.println("****************");
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			System.out.println(each);
		}

	}

}
