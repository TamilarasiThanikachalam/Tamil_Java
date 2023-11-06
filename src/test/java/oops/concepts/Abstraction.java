package oops.concepts;

public class Abstraction implements Inter {

//	* The process of hiding details or implementation and showing only the essential information is called Abstraction
//	* We can achieve this using interface and Abstract class
//	* We can also achieve this using certain access modifiers such as protected, private, final, etc.
	
	
	public void method1() {
	Abstraction obj = new Abstraction();
	obj.meth1();
}

}

interface Inter {
	
	default void meth1() {
		System.out.println("hello");
	}
}
