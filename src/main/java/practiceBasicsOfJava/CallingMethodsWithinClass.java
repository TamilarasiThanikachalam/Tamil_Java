package practiceBasicsOfJava;

public class CallingMethodsWithinClass {
	// Calling static method / Variable from Non-static method - direct call
	// Calling static method / Variable from static method - direct call
	// Calling Non-static method / variable from Non-static method - Object creation
	// Calling Non-static method / variable from static method - Object creation
	public static void main(String[] args) {
		System.out.println("CallingMethodsWithinClass");
		
	}

	public static void static1() {
		System.out.println("Calling Non-static method from static method");
		CallingMethodsWithinClass Obj1 = new CallingMethodsWithinClass();
		Obj1.nonStatic2();
		
	}
	public static void static2() {
		System.out.println("Calling static method from static method");
		static1();
	}
	public void nonStatic1() {
		System.out.println("Calling static method from Non-static method");
		static2();
	}
	public void nonStatic2() {
		System.out.println("Calling Non-static method from Non-static method");
		CallingMethodsWithinClass Obj2 = new CallingMethodsWithinClass();
		Obj2.nonStatic1();
	}
}
	

