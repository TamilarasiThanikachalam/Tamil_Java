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
		System.out.println("This is method1 start");
		ObjectCreation obj1 = new ObjectCreation();
		obj1.method2();
		System.out.println(obj1.price);
		
		System.out.println(PRICE);
		System.out.println("This is method1 end");
	}
	
	public void method2() {
		System.out.println("This is method2 start");
		System.out.println(a);
		ObjectCreation obj = new ObjectCreation();
		System.out.println(obj.a);
		
		System.out.println(B);
		
		System.out.println("This is method2 end");
	}
	
	public static void main(String[] args) {
		
//Syntax for object creation
//		referenceClass objectVariableName = new(keyword) ClassForWhichWeAreCreatingObject();
		ObjectCreation obj = new ObjectCreation();
//		obj.a;
		System.out.println(obj.a);
		System.out.println(obj.A); // this is not the proper way to call static members
		System.out.println(A);//correct way of calling a static method/variable within static method/variable of the same class
		
		int d = 25;
		System.out.println(d);
		
		obj.method2();
		method1();
		
	}

}
