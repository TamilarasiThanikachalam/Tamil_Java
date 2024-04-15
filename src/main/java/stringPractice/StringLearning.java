package stringPractice;

public class StringLearning {

	public static void main(String[] args) {
		String str = "Mithran";
		String str1 = "Tamil";
		String str2 = "   ";
		String str3 = "";
		String str4 = "Java is a programming language";
		String str5 = "Java is a programming language";
		String str6 = "java Is A Programming Language";
		StringLearning Obj = new StringLearning();
		
//********************LENGTH*********************************
//		Obj.stringLength(str);
		
//		stringLength2(null); throws nullPointerException
//		stringLength2(str1);
//		System.out.println(stringLength2(str1));
//		
//		System.out.println(str2.length());
//		System.out.println(str3.length());
//		System.out.println(str4.length());
		
//****************** IsEmpty **********************
//		System.out.println(str.isEmpty()); 
//		System.out.println(str2.isEmpty()); //String str2 = "   "; this will count the white spaces, hence false
//		System.out.println(str3.isEmpty()); //String str3 = ""; no chars or white space, hence true
//		
////******************** IsBlank **********************
//		System.out.println(str.isBlank());
//		System.out.println(str2.isBlank());//String str2 = "   "; this will not count the white spaces, hence true
//		System.out.println(str3.isBlank());//String str3 = ""; no chars or white space, hence true
		
//****************** CharAt ***********************
// Get the particular character or value as per index value 
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(7));//StringIndexOutOfBoundsException
//		System.out.println(str2.charAt(2));
//		System.out.println(str3.charAt(1));
		
//******************* equal *********************
//		System.out.println(str.equals(str1));
//		System.out.println(str1.equals(str2));
//		System.out.println(str4.equals(str5));
//		System.out.println(str5.equals(str6));
		
//***************** equalIgnoreCase ****************
//		System.out.println(str.equals(str1));
//		System.out.println(str4.equalsIgnoreCase(str5));
//		System.out.println(str5.equalsIgnoreCase(str6));
		
//**************** contentEqual *****************
//		System.out.println(str4.contentEquals(str5));
//		System.out.println(str5.contentEquals(str6));

		
//*********** Contains  ****************
		
//************* compareTo *************
// This is return 0 if 2 string are equal else will return some Unicode value's (whereas equal method will return true/false)
//		System.out.println(str.compareTo(str1));
//		System.out.println(str1.compareTo(str2));
//		System.out.println(str4.compareTo(str5));
//		System.out.println(str5.compareTo(str6));

//****************compareToIgnoreCase *******************
//		System.out.println(str.compareToIgnoreCase(str1));
//		System.out.println(str1.compareToIgnoreCase(str2));
//		System.out.println(str4.compareToIgnoreCase(str5));
//		System.out.println(str5.compareToIgnoreCase(str6));
		
//******************** startsWith ********************
		String abc = "Sathya";
//		System.out.println(abc.startsWith("S"));
//		System.out.println(abc.startsWith("s"));
//		
//		System.out.println(abc.startsWith(abc, 4));
//		System.out.println(abc.startsWith(abc));
//		System.out.println(abc.startsWith(str6));
		
//********************* EndsWith *********************
		String s1 = "SathyaMithran";
//		System.out.println(s1.endsWith("n"));
//		System.out.println(s1.endsWith("N"));
//		System.out.println(s1.endsWith("a"));
//		System.out.println(s1.endsWith(s1));
//		System.out.println(s1.endsWith(abc));
		
//************* hashcode ****************
//		String a1 = "A";
//		String a2 = "a";
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		System.out.println(s1.hashCode());
		
//************** indexOf ****************
//		System.out.println(s1.indexOf("M"));
//		System.out.println(s1.indexOf("m"));// if no string value found, default it will return -1
//		System.out.println(s1.indexOf("a"));// Return the Index value of the first occurrence of a
//		System.out.println(s1.indexOf("t", 2));
//		System.out.println(s1.indexOf("t", 5));// Return the index of 2nd occurrence of t as from index starts from 5
//		System.out.println(s1.indexOf("t", 9));//if no string value found , default it will return -1
		
//*********** LastIndexOf **********************
//		System.out.println(s1.lastIndexOf("t"));
//		System.out.println(s1.lastIndexOf("a", 1));
//		System.out.println(s1.lastIndexOf("a", 11));// checks till 11 th index value for a, hence 11
//		System.out.println(s1.lastIndexOf("a", 7));// Checks till index value 7 - M,Hence 5
		
		
//******************* subString ****************
		String b1 = "Sathya Tamil";
		
//		String s3 = b1.substring(3);
//		System.out.println(s3);
		
//		System.out.println(b1.substring(5, 8)); // return a T as output
//		System.out.println(b1.substring(5, 9)); // returns a Ta as output
		
//************* subSequence **********************			
//		System.out.println(b1.subSequence(5, 8)); // return a T as output
//		System.out.println(b1.subSequence(5, 9)); // returns a Ta as output
		
//************** concat *************
		String s4 = "Tamil";
		String s5 = "Sathya";
		String s6 = s4.concat(s5);
//		System.out.println(s6);
//		System.out.println(s4.concat(s5));
		
//**************** replace **************
//		System.out.println(s4.replace("a", "s"));
//		System.out.println(s4.replace("Tamil", "Mithran"));
//		System.out.println(s4.replace(s5, s6));
//		System.out.println(s4.replaceAll(s4, s5));
		
//****************matches **************
//		System.out.println(s4.matches(s5));
//		
//		String s7 = s4.replaceAll(s4, s5);
//		System.out.println(s7);
//		System.out.println(s5.matches(s7));
		
//******************* Split ***************
//		String A1 = "Tamil Mithran";
//		String[] A2 = A1.split(" ");
//		System.out.println(A2);
////		System.out.println(A1.split("M", 9));
		
//************ Join ***********
		String st = "Tamil";
//		String st1 = "Mithran";
//		String st3 = String.join(st, st1);
//		System.out.println(st3);
//		System.out.println(st);
		
//************* toUpperCase and toLowerCase*************
		
//		System.out.println(st.toLowerCase());
//		System.out.println(st.toUpperCase());
		
//********** trim **************
		String st4 = "        Mithran       Sathya    ";
		System.out.println(st4.trim()); // removes leading and trailing white spaces
		
//*************** strip ***********
		System.out.println(st4.strip()); // removes leading and trailing white spaces
		System.out.println(st4.stripLeading()); // removes leading white spaces
		System.out.println(st4.stripTrailing()); // removes trailing white spaces
		
			
		

		

		
		
		
		
		
		
		
		

	}
	public String stringLength(String str) {
		System.out.println(str.length());
		return str;
	}
	
	public static int stringLength2(String str) {
		int len = str.length();
		return len;
	}

}
