package basicsOfJava;

//* Sequence of characters is called String(Basic Explanation)
//* In Java, It is array of characters is called String.
//* In Java, String is a non- primitive data type
//* In Java String is a Class also
//* Why it is class, because we can perform many operations on String
//* if my String is "Sathya", length - 6, index starts with 0. Then last index is 5 or I can say length -1;
//
//How do we define String
//
//String str = "Raj"; - Literals 
//String str1 = new String("Ranjith"); - Instance or object creation
//


public class StringBasic {
	
	public static void main(String[] args) {
		
	
	String str = "Sathya";
	String str2 = "Sathya"+"Moorthi";
	String str4 = "Sathya";
	String str5 = "Moorthi";
	String str6 = str4 + str5;
	
	String str7 = null;
	String str8 = "null";
	String str9 = ""; //empty
	String str10 = "     "; //blank
	
	String strr = "* Sequence of characters is called String(Basic Explanation)";
	String str1 = "* Sequence of characters is called \"String\"(Basic Explanation)";
	String str3 = "* Sequence of characters is called "+"String"+"(Basic Explanation)";
	
	System.out.println(str);
	System.out.println(str2);
	System.out.println(strr);
	System.out.println(str1);
	System.out.println(str3);
	System.out.println(str6);
	
	String ss = "Sathiyamoorthi";
	//Sathiya"m"oorthi
	String ss1 = "Sathiya\"m\"oorthi"; 
	
	}

}
