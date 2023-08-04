package practiceBasicsOfJava;

public class CallingMethodsOutsideClass {
	//Calling static method from static method - use classname
	//Calling static method from non-static method - use classname
	//Calling non-static method from static method - Object creation
	//Calling non-static method from non-static method - Object Creation

	public static void static1() {
		CallingMethodsOutsideClass2.static2();

	}
	public void nonstatic1() {
		CallingMethodsOutsideClass2.static2();
	}
	

}
class CallingMethodsOutsideClass2 {
	public static void static2() {
		CallingMethodsOutsideClass Obj2 = new CallingMethodsOutsideClass();
		Obj2.nonstatic1();
	}
	public void nonstatic2() {
		
		CallingMethodsOutsideClass Obj1 = new CallingMethodsOutsideClass();
		Obj1.nonstatic1();

	}
	
}