package arrayParctice;

import java.util.Arrays;

public class ArrayTesting {
	

	static int a1[] = new int[3];
	int[] b = new int[3];
	char c[] = new char[] {'a', 'b'};
	int[] d = {1, 2, 3};
	String s[] = new String[] {"Mithran"};
	String s1[] = new String[2];
	
	int val = 10;
//	int value;
//	value = 20;
	
	public void stringArray() {
	String s1[] = new String[2];
	s1[0] = "Tamil";
	s1[1] = " ";
	}
	
	public void printIntArrayLength(int a[]) {
		System.out.println(a.length);
	}
	
	public static char printCharIndex(char c[]) {
		char[] c1 = new char[]{'A', 'B'};
		return c1[0];
		
	}
//	public void arrayEqual(int a[], int b[]) {
//		boolean b1 = Arrays.equals(a, b);
//		System.out.println(b1);
//	}
//	
	
	
	public static void main(String[] args) {
		
		ArrayTesting arr = new ArrayTesting();
		arr.arrayEqual(1, 2);
		char d = printCharIndex(arr.c);
		System.out.println(d);
		
		for(int a=0; a<=5; a++) {
			System.out.println(a);
		}
		
//		for(int a=0; a<=a1.length; a++) {
//		for(int a=0; a<=a1.length-1; a++) {
		for(int a=0; a<a1.length; a++) {
			System.out.println(a1[a]);
		}
		
		for(char foreach : arr.c) {
			System.out.println(foreach);
		}

		
	}

	private void arrayEqual(int i, int j) {
//		boolean b1 = Arrays.equals(a, b);
//		System.out.println(b1);
		
	}




}
