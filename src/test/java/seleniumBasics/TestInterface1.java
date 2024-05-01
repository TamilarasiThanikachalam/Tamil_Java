package seleniumBasics;

public interface TestInterface1 {
//	public interface WebDriver {

	public void method1();

	default void method2() {

	}

	public static void method3() {

	}

	public int method4();

	public int method5(String str);

	public interface TestInterface2 {
//		public interface Window {
//		public interface Options {
		public void methodA();

		public void methodB();

		public TestInterface3 methodC();
	}

	public TestInterface2 method6();

	
//	Another interface 
	public interface TestInterface3 {
		public void methodAA();

		public void methodBB();
	}

}

//public interface TestInterface3 {
interface TestInterface3 {

}

class TestClass implements TestInterface1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int method4() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method5(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TestInterface2 method6() {
		// TODO Auto-generated method stub
		return null;
	}

	public void myMethod11() {
		TestClass obj = new TestClass();
		TestInterface2 a1 = obj.method6();
		a1.methodA();

		obj.method6().methodA();
		obj.method6().methodB();
		
		
		obj.method6().methodC().methodAA();
	}

}
