package inheritancePractice;

public class TestClass1 extends MultipleInheritance implements IntefaceTest1{
	
	public void childmethod31() {
		System.out.println("Child class Non-static method 1");
	}

	public static void Childmethod32() {
		System.out.println("Child Class Static method 2");
	}
	
	
	public static void main(String[] args) {
		TestClass1 Obj  = new TestClass1();
		//Calling non-static parent class method using Object
		Obj.method22();
		
		//Parent class static method - direct call
				method23();
				
		//Calling non-static method from Interface using Object
		Obj.interfacemethod1();
			
		//Calling static method from Interface using Interface name
		IntefaceTest1.intefacemethod2();
		
		//Calling non-static child class method using Object
		Obj.childmethod31();
		
		//Calling static Child class method - Direct call
		Childmethod32();
	}

	@Override
	public void interfacemethod1() {
		System.out.println("Interface method 1");
		
	}

	
	

}
