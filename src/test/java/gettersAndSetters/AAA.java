package gettersAndSetters;

public class AAA {
	
	private int a  = 10;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int method2() {
		return a;
	}

	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.method1();
	}
	
	public void method1() {
		System.out.println(a);
	}

}

class BBB {
	
	public void methodB1() {
//		c should a + 10;
//		int c = a + 10;
		AAA obj = new AAA();
//		int c = obj.method2() + 10;
		int c = obj.getA() + 10;//getter
		System.out.println(c);
		
		obj.setA(100);
		obj.method1();
		
		System.out.println(obj.getA());
	}
	
	public static void main(String[] args) {
		BBB obj = new BBB();
		obj.methodB1();
	}
	
}
