package inheritancePractice;

public class InheritanceChildClass extends InheritanceParentClass{
	
	public void Childmethod1() {
		System.out.println("This is non-static Child class method 1");
	}
	
	public static void childmethod2() {
		System.out.println("This is static Child class method 2");
	}
	
	public void parentmethod1() {
		System.out.println("This is non-static Parent Class Method - Child Class method Overrided");
	}

	public static void main(String[] args) {
		
		//Created Object C with Child class as reference both Parent class and Child class non-static member can be called and used.
		InheritanceChildClass C = new InheritanceChildClass();
		C.parentmethod1(); //Overriding 
		//Static method from parent class - direct call
		parentmethod2();
		
		C.Childmethod1();
		childmethod2();
		
		//Created Object C1 with parent class as reference only Parent class non-static member can be called and used.
		InheritanceParentClass C1 = new InheritanceChildClass();
		C1.parentmethod1(); //Overriding
		
		parentmethod2();
		
		InheritanceParentClass P2 = new InheritanceParentClass();
		P2.parentmethod1();
		
		
		

	}

}
