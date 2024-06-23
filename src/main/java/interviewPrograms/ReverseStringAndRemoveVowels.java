package interviewPrograms;

public class ReverseStringAndRemoveVowels {
	public static void main(String args[]) {
		String str = "Apple and Orange are brothers";

		String[] str1 = str.split(" ");

		System.out.println("Reverse each string");
		for (int i = 0; i <= str1.length - 1; i++) {
			reverseString(str1[i]);

		}
		System.out.println("\n Remove Vowels");
		for (int i = 0; i <= str1.length - 1; i++) {
			removeVowels(str1[i]);
		}

	}

	public static void reverseString(String str2) {
		String str = str2.toString();
		String[] str3 = str.split("");
		for (int i = str3.length - 1; i >= 0; i--) {
			System.out.print(str3[i]);
		}
		System.out.print(" ");
	}

	public static void removeVowels(String str4){
	           
	           char[] ch = {'a', 'e', 'i', 'o', 'u'};
	           String str3 = str4.toLowerCase();
	           char[] str5 = str3.toCharArray();
	    	   
	    	   String vowels = "aeiou";
	           
	           for(int i=0; i< str5.length-1; i++){
	        	   for(int j = 0; j<=ch.length-1; j++) {
	        		   if(str5[i]!=(ch[j])){
	   	                System.out.print(str5[i]);
	           
	          
	       }
	    }
	           }
	}
}
	       

//	for(int i = 0;i<originalString.length();i++)
//	{
//		char currentChar = originalString.charAt(i);
//		// Check if the current character is a vowel
//		if (!isVowel(currentChar)) {
//			modifiedString += currentChar;
//		}
//	}System.out.println("Modified string: "+modifiedString);
//	}
//
//	public static boolean isVowel(char c) {
//	        // Convert the character to lowercase for case-insensitive matching
//	        c = Character.toLowerCase(c);
//	        // Check if the character is a vowel
//	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//	    }
//}}
