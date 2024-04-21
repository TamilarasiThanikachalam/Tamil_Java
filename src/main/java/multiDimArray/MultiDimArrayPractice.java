package multiDimArray;

import java.util.Scanner;

public class MultiDimArrayPractice {

	public static void main(String[] args) {
		twoDimArray();
		
		
	}
	public static char[][] twoDimArray() {
		
		Scanner sc = new Scanner(System.in);
//		char ch[][] = new char[2][2];
//		int row = 0, col = 0;
		System.out.println("Enter the Row" );
		int row = sc.nextInt();
		
		System.out.println("Enter the Column");
		int col = sc.nextInt();
		
		char ch[][] = new char[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0; j <col; j++) {
				System.out.println("Row " +i+ "Col " +j);
				
				ch[i][j] = (char) sc.nextInt();
				System.out.println(ch[i][j]);
			}
		}
		return ch;
	}

}