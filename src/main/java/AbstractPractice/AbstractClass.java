package AbstractPractice;

public abstract class AbstractClass {

//	public abstract class AbstractClass implements InterfaceTest{
	//abstract keyword is must to create abstract / bodyless method
	public abstract void method1();
	
	private void method2() {
		System.out.println("Private Method2 cannot used in the inherited class");
	}
	
	protected abstract void method3();
	
	static void method4() {
		System.out.println("Abstract Class static method4");
	}
	
	abstract void method5();
	
//	static void method12();
	
	
}
