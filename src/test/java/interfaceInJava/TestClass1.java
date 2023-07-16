package interfaceInJava;

public class TestClass1 implements LearnInterface {
	
	int a = 10;
	public String str = "Sathya";
	private int b = 20;
	protected int c = 30;
	
	
	static int a1 = 20;

	public static void main(String[] args) {
		TestClass1 obj = new TestClass1();
		System.out.println(obj.a);
//		obj.rule1();
		obj.method1();
	}

	
	
	public void method1() {
		System.out.println("I am a method from class");
	}



	@Override
	public void rule1() {
		System.out.println("I am a non-static, non parametized method from interface");
		
	}

	@Override
	public void rule22(int k) {
		System.out.println("I am a non-static, parametized method from interface");
		
	}


}
