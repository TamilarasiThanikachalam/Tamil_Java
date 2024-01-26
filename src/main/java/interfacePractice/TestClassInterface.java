package interfacePractice;

public class TestClassInterface implements InterfaceTestOne{
	
	String s = "Mithran";
	
	//Unimplemented method from Interface
	@Override
	public void printNumbers(int a) {
		System.out.println(a);
	}
	//Bodyless method not possible inside the class
	//	public void printText();
	
	//Non-static Method belongs to this class
	public void method1() {
	System.out.println(s);
	}
	
	public static void main(String args) {
	//Created Object for the class using same class as reference, we can call TestClassInteface methods and InterfaceTestOne Methods
		TestClassInterface Obj = new TestClassInterface();
	//Calling the method inside this class
		Obj.method1();
	//Calling the non-static method belong to Interface
		Obj.printNumbers(i);
		
		
	//Created Object for the Class using Interface as reference, we can call only the methods declared in the interface
		InterfaceTestOne Obj1 = new TestClassInterface();
	//Calling the Method from Interface
		Obj1.printString();
		
	//Tried calling the Method in the same class using the Obj1 which uses Interface as reference to create an Object
	//	Obj1.method1();
		
			
		
	}

	
}
