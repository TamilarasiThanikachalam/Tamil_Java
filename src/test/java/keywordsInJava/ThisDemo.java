//* this. keyword is used to call instance/class variables and methods. 
//* this. keyword is always present implicitly when we call instance/class variables and methods within the class.
//	* We can use this., to differentiate run time variables/local variable from instance variables;
//	* Also by using this., we can assign runtime values to instance variables
//* When we call a non static method from another non static method in a same class, "this." is used implicitly while calling
//	* calling a method(), is same as this.method() with in a same class. Only for calling non-static from static, we need to create object


//* We can use this(), to call other constructors from any constructors within a class.
//* this() should be used within a constructor only. Means, we can not use it in methods.
//* this() MUST be first statement in constructor calling
//		- Constructor call must be the first statement in a constructor
//* since this() should be used as first line in constructor, we can not call more than one constructor from a constructor.
//		* means, we can not call more than one constructor from any constructor

//* within a class, 
//	1) we can simply call static method from another static method (this keyword is applied implicitly, but we always prefer static type calling)
//	2) We can simply call non-static method from another non-static method (this keyword is applied implicitly)
//	3) We need to create object to call a non-static method from a static method
//	4) We can simply call static method from non-static method (this keyword is applied implicitly, but we always prefer static type calling)

//* We can not use this. keyword inside a static method.
//* We could call only one constructor from another constructor. We can not call multiple constructor from one constructor because this() should
//	be first line inside a constructor
//* We can pass variable name inside this() but the variable should be static.


package keywordsInJava;

public class ThisDemo {
	
	public int a = 10; 
	public static int b = 20;
	
	public String c;
	
	public int num = 20;
	public int test = 44;
	
	public static String str1 = "Mrrrrrr.";
	public String str2 = "Mss.";
	
	public ThisDemo(int num) {
//		num = num;
		this.num = num; 
		num = this.num;
		int a = 10;
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.num);
	}
	
	
	public ThisDemo(String str) {
		System.out.println(str1);
		c = str;
		System.out.println("Hello");
	}
	
	public ThisDemo() {
//		this("Mr.");
//		this(null);
//		this("");
//		this("  ")
//		this(str1);
//		this(str2);
		System.out.println(a);
		System.out.println(this.a);
		String str1 = "Mr.";
//		this(str1);
	}
	
	public void methodA() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		
		method1();
		this.method1();
//		this();
		
		method4();
		this.method4();
	}
	
	public static void methodB() {
		ThisDemo obj = new ThisDemo();
		System.out.println(obj.a);
		
		obj.methodA();
		
//		this.method4();
		method4();
//		this.method4();
	}
	
	public void method1() {
//		this();
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.test);
		System.out.println(this.num);
		System.out.println("This is method1");
	}
	
	public void method2() {
//		ThisDemo test = new ThisDemo(50);
		ThisDemo test1 = new ThisDemo();
//		test.method1();
		System.out.println("This is method2");
		this.method1();
		method1();
		method4();
		this.method4();
	}

	public static int method3(int num) {
		System.out.println(num);
//		System.out.println(test);
//		System.out.println(this.num);
		System.out.println("This is static method3");
		return num;
	}
	
	public static void method4() {
		System.out.println("This is static method4");
		method3(5);
	}
	
	public static void main1(String[] args) {
//		this.test=30;
		method4();
//		ThisDemo test = new ThisDemo(50);
//		test.method1();
	}
	
	public static void main(String[] args) {
		
		ThisDemo obj1 = new ThisDemo();
		System.out.println(obj1.c+"Sathya");
		
//		ThisDemo obj2 = new ThisDemo("Mr.");
//		System.out.println(obj2.c+"Sathya");
	}

}
