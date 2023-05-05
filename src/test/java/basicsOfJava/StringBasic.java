package basicsOfJava;

//* Sequence of character (Basic Explanation)
//* In Java, It is array of character
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
	
	String str1 = "* if my String is "+"Sathya"+", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
	String str3 = "* if my String is \"Sathya\", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
	
	System.out.println(str);
	System.out.println(str2);
	System.out.println(str1);
	System.out.println(str3);
	
	String ss = "Sathiyamoorthi";
	//Sathiya"m"oorthi
	String ss1 = "Sathiya\"m\"oorthi"; 
	
	}

}
