package scanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPractice {
	
	static PrintStream obj;

	public static void main(String[] args) {
//		ScannerPractice scan = new ScannerPractice();
//		scan.learnScanner();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 5 numbers");
		
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
		
		for(int i = 0; i<5; i++ ) {
			System.out.println("Please enter "+i+" numbers");
			sc.nextInt();
		}
		
	}
	
	public void scannerBasic() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
		System.out.print("Please enter a two digit number: ");
		int a = sc.nextInt();
		
		if(a<10) {
			System.out.println("You have entered single digit number, please enter two digit number");
		}
		else if (a>=100) {
			System.out.println("Please enter two digit only");
		}
		else
			System.out.println("Good");
		
		
		System.out.print("Enter enter your name : ");
		sc.next();
	}
	
	public void learnScanner() {

//		Scanner scan = new Scanner(InputStream is);
		Scanner scan = new Scanner(System.in);
		
//		System.out.println();
		
//		PrintStream obj = new PrintStream();
		PrintStream obj11 = new PrintStream(System.out);
				obj.println();
		System.out.println();
//		if we calling from different class, ScannerPractice.obj
		
//		System.out
//			out is a PrintStream class's static object variable created in System class
//			by using this object(System.out) we can call all the methods present in PrintStream class
		
		
//		System.out.println(true);
//		System.out.println('c');
//		System.out.println("abc");
//		
//		System.out.print('c');
//		System.out.print("Sathya");
//		
//		System.out.println("Please enter a number: ");
//		System.out.print("Please enter a number: ");
//		int inputFromUser = scan.nextInt();
//		System.out.println("You have entered "+inputFromUser);
//		System.out.print("Please enter your name: ");
//		System.out.println(scan.next());
		
		
		
//		System.out.println("Please enter 10 numbers");
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		for(int i = 1; i<=10; i++ ) {
//			scan.nextInt();
//		}
		
		
		System.out.println("Please enter 3 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " is big");
		}
		else if(b>c) {
			System.out.println(b + " is bigg");
		}
		else 
			System.out.println(c + " is biggg");

	}

}
