package constructorPractice;

public class ConstructorCallingVariableAndMethods {
	
	public void method1() {
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println(c);
	}

	
	public static  String method2() {
		String str = "Mithran";
		return str;
	}
	
	public ConstructorCallingVariableAndMethods() {
		int f = 10;
		System.out.println(f);
		method1();
		method2();
		System.out.println(method2());
		
		
	}
	

	public static void main(String[] args) {
		ConstructorCallingVariableAndMethods Obj = new ConstructorCallingVariableAndMethods();
		

	}

}
