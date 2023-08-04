package constructor;

public class DummyCon {
	
	int a = 10;
	static String str = "abc*";
	
	int var; 
	
//	public DummyCon() {
//		int b = 10;
//		System.out.println("I am constructor");
//		System.out.println(a);
//		System.out.println(str);
//		method1();
//		System.out.println(var);
//		var = b;
//		System.out.println(var);
//		
//	}
	
	public DummyCon() {
		
	}
	
	public DummyCon(int a) {
		System.out.println("I am int parameterized construcor");
	}

	public static void main(String[] args) {
		DummyCon obj = new DummyCon();
		obj.method1();
		DummyCon obj1 = new DummyCon(0);
	}
	
	public void method1() {
		System.out.println("I am method1");
	}

}
