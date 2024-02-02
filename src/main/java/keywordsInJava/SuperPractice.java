package keywordsInJava;

public class SuperPractice extends ParentClassA{
//super - We create object in the child class with child as reference, we call parent class method but child class method will be called
// In this case super is used to access the parent class variable and methods.
	public void parentClassA() {
		System.out.println("Child class non static method");
	}
	public void parentClassA(int a) {
		System.out.println("Child class parameterized method");
		
	}
	public static void parentClassA(String str) {
		System.out.println("Child class static parameterized method");
	}	
	
	public void test22() {
		super.parentClassA();
//		super.parentClassA(20);
		
	}
	public static void main(String[] args) {
		
		
		ParentClassA Obj = new SuperPractice();
//		calling parentclass method, but override will take place.
		Obj.parentClassA();
		
//		To overcome the above override, created new method test22() and called the parent method which we want using super
//		now we just need to call test22() to get the parent method in the child class if override happens
		
		
		SuperPractice Obj1 = new SuperPractice();
//		Obj1.parentClassA();
		Obj1.test22();
		

	}

}
class ParentClassA {
	
	public ParentClassA(){
		
		System.out.println("Parent Class defualt Constructor");
	}
	public ParentClassA(int a) {
		System.out.println("Parent Class Parameterized Constructor");
	}
	
	public void parentClassA() {
		System.out.println("Parent class non static method");
	}
	public void parentClassA(int a) {
		System.out.println("Parent class parameterized method");
	}
	public static void parentClassA(String str) {
		System.out.println("Parent class static parameterized method");
	}
}
