package basicsOfJava;

public class VariablesInJava {
	
	int b = 10; //classLevel variable or instance variable;
	
	static int c = 20; // static variable
	
//	final int d;

	public static void main(String[] args) {
		int a = 10; // local varibale
		VariablesInJava ObName = new VariablesInJava(); //local variable
		
//		static int d = 10;
		
		System.out.println(a);
		
		System.out.println(ObName.b);
		
		System.out.println(c);
		
		int b = 20;
		
		System.out.println(b);
		
		method2();
	}
	
	
	public void method1() {
		int a = 10; // local varibale
		VariablesInJava ObName = new VariablesInJava(); //local variable
		
//		static int d = 10;
		
		System.out.println(a);
		
		System.out.println(ObName.b);
		
		System.out.println(c);
		
		method2();
	}
	
	public static void method2() {
		int a = 10;
		
		VariablesInJava ObName = new VariablesInJava();
		
		ObName.method1();
	}
	
	public void method3() {
		
		method1();
		
		VariablesInJava ObName = new VariablesInJava();
		ObName.method1();
	}
	
	

}
