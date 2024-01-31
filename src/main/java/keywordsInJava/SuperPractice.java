package keywordsInJava;

public class SuperPractice extends ParentClassA{
//Super() - We create object in the child class with parent as reference, we call parent class method but child class method will be called
// In this case Super() is used to access the parent class variable and methods.
	public void parentClassA() {
		System.out.println("Child class non static method");
	}
	public void parentClassA(int a) {
		System.out.println("Child class parameterized method");
	}
	public static void parentClassA(String str) {
		System.out.println("Child class static parameterized method");
	}	
	
	public static void main(String[] args) {
		ParentClassA Obj = new SuperPractice();
		Obj.parentClassA();
		

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
