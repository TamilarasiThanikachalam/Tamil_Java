package basicsOfJava;

public class CallingMethods {

	/*
	 * With in a class 1. calling static method from non static method - direct call
	 * 2. calling static method from static method - direct call 3. calling
	 * non-static method from non-static method - direct call 4. calling non-static
	 * method from static method - Object creation
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void method1() {
		// Object creation
		CallingMethods practiceMethodsCalling = new CallingMethods();
		practiceMethodsCalling.method3();
	}

	public static void method2() {
		method1();
	}

	public void method3() {
		method1();
	}

	public void method4() {
		method3();
	}

	//Another class in same file
	class ClassB {

	}
	
//	Outside class
//	1. calling static method from non static method - using className
//	2. calling static method from static method - using className
//	3. calling non-static method from non-static method - Creating Object
//	4. calling non-static method from static method - Creating Object
	
	public static void test1() {
		ClassA.m1();
		
		ClassA obj1 = new ClassA();
		obj1.m2();
	}
	
	public void test2() {
		ClassA.m1();
		
		
		ClassA obj1 = new ClassA();
		obj1.m2();
	}
	

}


class ClassA {
	
	public static void m1() {
		
	}
	
	public void m2() {
		
	}

}
