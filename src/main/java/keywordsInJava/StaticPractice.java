package keywordsInJava;

public class StaticPractice {
	
	static int i;
	
	public static void method1() {
	//	static int a =10;
		
		System.out.println("Static Method");
		
	}
	
//	overloading static method
//	Overriding static method not possible because it depends on object creation, we wont create object for static method
	
	public static void method1(int a) {
		System.out.println("Overriding static method ");
	}
	
//	public final StaticPractice() {
//		static int b =20;
//		
//	}
	
	public static void main(String[] args) {
		method1();
	}

}
