package interfaceInJava;

// Normal methods are called concrete methods(with body).
//Interface can have only abstract methods or body less method
//Means we can not implement any methods or put body for a method in interface(until Java 1.6?)
//We can declare variables in interface but we need to initiate it then and there;
//Variables defined in interfaces are final in nature, means we can not change the value in any of the following classes.
// We can not create variables or methods with protected or private access modifiers
//We can not create Object for Interface because it only has Abstract methods. Also we can create object only for classes not for interfaces
//Interface can not have constructors.
//If a class wants to inherit the property of an Interface, we need to use "implements" keyword.
//If we want to link a interface with another interface, we need to use "extends" keyword.
//Whenever a class implements an interface, it will force us to implement all the unimplemented methods in our class

//We can not create a static abstract/bodyless method in an interface but we can create it as a concrete method.
//Interface let us to have methods with body but those methods should be either static or default method
//We can have static method in interface and we can call it in a following class by using interface name.
//We can access default method in implemented class by using object
//We create object for a class using interface as a reference 
//We can give an interface as a return type
//We can create a interface within a interface

public interface LearnInterface {

	int a = 10;
	public int b = 10;
//	private int c = 10;
//	protected int d = 10;
	

	static int a1 = 10;
	static public int b1 = 10;
//	static private int c1 = 10;
//	static protected int d1 = 10;

//	int f;
//	public static int g;
	
	final int k = 100;
	static final int k1 = 100;
	
//	LearnInterface obj1 = new LearnInterface();

	public void rule1();
	public void rule22(int k);
//	abstract method
	
//	public void rrule1() {
//		
//	}
	
//	public static void rule4();

	public static void rule2() {
		System.out.println(a);
		System.out.println(k);
		System.out.println("I am static method from interface");
	}

	default void rule3() {
		rule2();
		System.out.println("I am default method from interface");
	}
	
	
//	WebDriver
	RemoteWebDriver
//	ArrayList

}
