package string;

public class TestString {

	public static void main(String[] args) {
		String str = "Vinothini";
		
		String[] allString = str.split("");
		
		for(String eachString: allString) {
			System.out.println(eachString);
		}
		
		char[] eachChar1 = str.toCharArray();
		
		for(char each: eachChar1) {
			System.out.println(each);
		}
		
		System.out.println("****************");
		for(int i = 0; i<str.length();i++) {
			char each = str.charAt(i);
			System.out.println(each);
		}
		
	}

}
