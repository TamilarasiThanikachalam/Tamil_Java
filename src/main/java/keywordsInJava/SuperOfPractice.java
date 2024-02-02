package keywordsInJava;

public class SuperOfPractice extends SuperParent {

	public SuperOfPractice() {
//		this();
		super(10);
		System.out.println("Child class default Constructor");
		
	}
	public SuperOfPractice(int a) {
//		super(10);	
//		this();
//		
		System.out.println("Child Class parameterized Constructor");
	}
	
	public static void main(String[] args) {
		SuperOfPractice s1 = new SuperOfPractice();
		SuperOfPractice s2 = new SuperOfPractice(10);
		s1.method1();

	}
	

}

class SuperParent{
	
	 public SuperParent() {
			System.out.println("Parent Class default Constructor");
		}
	
	 public SuperParent(int a) {
			System.out.println("Parent Class int parameterized Constructor");
		}
	public void method1() {
		System.out.println("Parent class method 1");
	}
		
	}
