// * When a variable or object is created inside a method, its belong to the method. No other method can use it.
// * So, whenever we have a method with return type, it does some work and give us something back
//		These methods or variable's visibility ends once the holding method get executed. In order to use the variable's 
//		value outside the method, we have return type concepts.
// * Whenever we use a return type in a method, store the method return value in a variable and use that variable wherever we want to use the method.
// * Whenever there is return type mentioned, at the end of method, we need to use "return" keyword, after that we should not be writing anything
//   		* means, return should be always at end of the methods 
// * Return type can be anything such as Interface, Class, primitive and non-premitive data type such String and Array, Collections and Object too
// * Either we can directly use the method in some other method or we assign method's return type to respective variable
// * Return keyword can have exact return type or its variable name
//	* Parameters can be methods with return type too

package basicsOfJava;

public class ReturnDefinition {

	static String zz;

	public static void main(String[] args) throws InterruptedException {
		ReturnDefinition test = new ReturnDefinition();
		zz = test.methodWithReturnType();
		test.method1();
		test.method2();
//		Object testObject = new Object(); 
		Object testObject = test.methodWithReturnTypeAsObject(); // this line is nothing but about line;
		testObject.wait();

	}

	public String methodWithReturnType() {
		String test = "Sathya";
		System.out.println(test);
		return test;
//		return "Sathya";
//		System.out.println("Abc");
	}

	public void method1() {
//		String xx = methodWithReturnType();
		System.out.println(zz);
//		doing some other work in this method by getting the value from the above method
//		method1 just want the value from "method with return type method". 
//		so method1 not worrying about what happening inside "method with return type method".
	}

	public void method2() {
//		String yy = methodWithReturnType();
		System.out.println(zz);
	}

	public Object methodWithReturnTypeAsObject() {
		ReturnDefinition test = new ReturnDefinition();
//test.
		return test;
	}

	public int method3(int a) {

		return 30;
	}
	
	public int method4(int ab) {
		
		return ab;
	}
	
	public int method5(int abc) {
		int test = abc;
		return abc;
	}
	
	int test;
	public int method6(int aa) {
		
		test = aa;
		return test;
	}
	
	public String method7(int aa) {
		String testName = "Sathya";
		return testName;
	}

}
