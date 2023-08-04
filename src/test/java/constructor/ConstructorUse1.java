package constructor;

public class ConstructorUse1 {

	int a = 10;
	int x;

	final int b = 20;
	final int y;

	static int c = 30;
	
	public ConstructorUse1() {
		y = 20;
//		y = 50;
		System.out.println("Final variable y value is " + y);
	}
	
//	public DummyConstructor(int s) {
//		y = 50;
////		this.y = 50;
//	}
	
	public ConstructorUse1(int y) {
//		y = y;
		this.y = y;
	}

//	public DummyConstructor(int a) {
//		y = a;
//	}
	
	public static void main(String[] args) {

		ConstructorUse1 obj = new ConstructorUse1();
		System.out.println("Final variable y value is " + obj.y);
		obj.method1();
		obj.method2();
		obj.method3();
		
		ConstructorUse1 obj1 = new ConstructorUse1(1);
		obj1.method3();

	}

	public void method1() {
//		System.out.println(a+ x+ b);
		System.out.println(a + " " + x + " " + b);
		System.out.println(a);
		System.out.println(x);
//		System.out.println(b);

		a = 20;
		x = a + 20;
//		b = 10;
//		b = x + 10;
		System.out.println(a + " " + x + " " + b);
	}

	public void method2() {
//		I want final variable 'y' with value 20;

		ConstructorUse1 obj = new ConstructorUse1();
		System.out.println(a = y + 10);
	}

	public void method3() {
//		I want final variable 'y' with value 50;
		ConstructorUse1 obj = new ConstructorUse1(1);
		System.out.println(y);
		
	}

	public void callingNonStaticMethod() {
		method3();
		this.method3();
	}

}

