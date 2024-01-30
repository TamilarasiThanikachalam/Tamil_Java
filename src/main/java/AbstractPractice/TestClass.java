package AbstractPractice;

public class TestClass extends AbstractClass implements InterfaceTest{

	public static void main(String[] args) {
				
		TestClass Obj = new TestClass();
				
		//Calling Abstract class public Non-static Method can be called using Object 
		Obj.method1();
		
		//Abstract Class private method cannot be called.
		//Obj.method2();
		
		//calling Abstract class Protected Non-static Method can be called using Object - same package
		Obj.method3();
		
		//Calling Abstract class public static Method- Direct call
		method4();
		
		Obj.method5();
		
		//Calling non-static method from Interface using TestClass Object
		Obj.method6();
		//Calling static method from the Interface using Intefacename
		InterfaceTest.method7();
		

	}

	@Override
	public void method1() {
		System.out.println("Abstract Class public method1");
		
	}

	@Override
	protected void method3() {
		System.out.println("Abstract class protected method3");
		
	}

	@Override
	void method5() {
		System.out.println("Abstract Class Abstract method5");
		
	}

	@Override
	public void method6() {
		System.out.println("Interface non-static method6");
		
	}

}