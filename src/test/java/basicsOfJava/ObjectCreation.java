package basicsOfJava;

public class ObjectCreation {
	
	int a = 10;
	private String b = "Sathya";
	protected char c = 'C';
	public float price = 75.35f;

	static int A = 10;
	static private String B = "Sathya";
	static protected char C = 'C';
	static public float PRICE = 75.35f;
	
	public static void method1() {
		
	}
	
	public void method2() {
		
	}
	public static void main(String[] args) {
		ObjectCreation obj = new ObjectCreation();
//		obj.a;
		System.out.println(obj.a);
		System.out.println(obj.A); // this is not the proper way to call static members
		System.out.println(A);//correct way of calling a static method/variable within static method/variable of the same class
	}

}
