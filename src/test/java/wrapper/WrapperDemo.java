/*
		* int, double, char, float, short, boolean, long, byte - all are primitive data types
		* means, they can hold a value but they are not having any inbuild methods.
		* Simply, datatypes are not Objects
		* Wrapper classes helps us to use primitive data type as Objects
		* int - Integer
		* char - Character
		* boolean - Boolean and so on.
		* int a = 5; primitive datatype
		* Integer a = 5; Object
		* Interger a = new Integer(5);
		* 
		*/
		

package wrapper;

public class WrapperDemo {



	public static void main(String[] args) {
		int a = 5;
		Integer a1 = 50;
		System.out.println(a);
		System.out.println(a1);
//		a. - not going to show any methods 
//		a1. - it contains many methods
		
		Character ch = 'a';
		
		Integer a2 = new Integer(10);
		
//		int[] arr = new int[3];
		Integer[] intArray = new Integer[3];
		intArray[0]  = 1;
		intArray[1]  = 2;
		intArray[2]  = 3;
		
		String str = "10";
//		System.out.println(str>10);
		Integer a3 = new Integer(str);
		System.out.println(a3==10);
		
//		What is parsing
		
//		parseInt(int i);
		
//		intArray[0].compareTo(1)
		
		int b = 10;
		Integer s = Integer.valueOf(b);
		System.out.println(s);
		System.out.println(s.reverse(10));
		
//		StringBuilder
//		StringBuffer
		
	}


}
