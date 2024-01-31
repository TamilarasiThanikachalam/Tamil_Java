package keywordsInJava;

public class FinalPractice {
	
	final int i = 10;
	final int j;
	
	public FinalPractice() {
		j = 20;
	}
	//Non - static final method
	final public void methodC() {
		final int s;
		System.out.println("Final Method");
	}
	
	final static public void methodD() {
		System.out.println("Static final Method");
	}
	
//	Overloading final method
	final public void methodC(int a) {
		
	}

	public static void main(String[] args) {
		

	}

	final class TestClassA implements InterfaceClassA{
		
	}
	
// TestClassA cannot be inherited - final class	
//	class TestClassB extends TestClass {
//		
//	}
	
//	 Overriding final method not possible
//	class TestClassC extends FinalPractice {
//		
//		final public void methodC() {
//			
//		}
//	}
		
	interface InterfaceClassA {
		
	}
}
