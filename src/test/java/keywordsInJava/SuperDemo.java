//* super is keyword, it can be used with variables(static and non static), methods(static and non static) and constructors
//* super can not be used in main method or static method
//* whenever a child class overrides, variable and method of a parent class and if we want to use parent class variable and method
//	* in child class method, then we use super keyword to call parent class overridden method or variable.

//* All child class constructors have super() method written implicitly.
//* If we written super() explicitly, we cant use this() inside constructor. 
//	But while super() is implicit, we can use this(). So in this case both super() and this() will run; THIS IS WRONG
//* super(); 
//* whenever we call a child class constructor, parent class constructor will be always called because
//	* in child class constructor, super() keyword is implicitly written and it will call the parent class default constructor
//* Child class's parameterized constructor ALWAYS have super() implicitly written but NOT super(parameterized);
//* Parameter passed in child class constructor wont be passed to super()
//* If we want our child class's parameterized constructor to call parent class's parameterized constructor,
//	* then we need to pass the parameter to super() by overriding it. e.g(super(5) or super("Sathya"))

//* From child class constructor, we can either call parent class constructor(super()) or child class constructor(this()).


package keywordsInJava;

public class SuperDemo extends ParentSuperDemo {

	int c = 60;
	
	public SuperDemo() {
//		super();
		super("Sathya");
		System.out.println("I am child class constructor");
	}
	
	public SuperDemo(int a) {
//		super();
		this();
//		super(a);
//		super("Sathya");
		System.out.println("I am child class parameterized constructor");
	}

	public void method1() {
		System.out.println("Static method of child class");

	}

	public void method2() {
		System.out.println(c);
		System.out.println(super.c);
		System.out.println("Non static method of child class");
		
		method1();
		//different ways to calling method1 from parent class from child class
		super.method4();
		super.method1();
		SuperDemo test = new SuperDemo();
		test.method1();
		ParentSuperDemo test1 = new ParentSuperDemo();
		test1.method1();
		//did not use third object creation type because even if we call parent class method1, override will take place and it will run child class method1
		
		method3();
		super.method3();
		ParentSuperDemo.method3();
		
	}
	
	public static void method3() {
		System.out.println("I am static child method");
//		super.method3();
	}

	public static void main(String[] args) {
//		SuperDemo test = new SuperDemo();
//		test.method2();
//		super.method3();
		
		SuperDemo test = new SuperDemo(5);
	}

}

class ParentSuperDemo {
	
	int c = 20;
	
	public ParentSuperDemo() {
		System.out.println("I am parent class default constructor");
	}
	
	public ParentSuperDemo(String a) {
		System.out.println("I am parent class String parameterized constructor");
	}
	
	public void method1() {
		System.out.println("Static method of parent class");
	}

	public void method2() {
		System.out.println("Non static method of parent class");
	}
	
	public static void method3() {
		System.out.println("I am static parent method");
	}
	
	public void method4() {
		
	
	}

}
