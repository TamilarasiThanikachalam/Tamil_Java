package basicsOfJava;

// Constructor name should be same as Class name.
// Constructor is not a method
// It should not have a return type
// Constructor belongs to the class.
// each class has its own constructor but it is hidden (implicit)

public class ConstructorBasic {
	
//	public ConstructorBasic() {
//		System.out.println("I am constructor");
//	}
	
//	Below is a method not constructor
//	public void ConstructorBasic() {
//		System.out.println("I am not a constructor");
//	}
	
//	we cannot create a method without a returntype
//	public method3() {
//		
//	}
	
	
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		ConstructorBasic obj = new ConstructorBasic();
		System.out.println(obj.a);
		obj.method1();
	}
	
	public void method1() {
		System.out.println("I am method1");
	}

}
