package constructorPractice;

public class ConstructorFinalThisPractice {
	
	final int a = 10; // a value cannot be changed
	final int b;
	
	// Default constructor called explicitly
//	public ConstructorFinalThisPractice() {
//		//Constructor is used to initialize the final variable using this if it is not initialized already
//		this.b = 20;
//		
//	}
	
	private ConstructorFinalThisPractice(int b) {
		// this is used to refer the  current object in the constructor
		this.b = 20;

	}

	public static void main(String[] args) {
//		ConstructorFinalThisPractice obj1 = new ConstructorFinalThisPractice();
//		obj1.addition();
		
		//Parameterized constructor calling
		ConstructorFinalThisPractice obj2 = new ConstructorFinalThisPractice(10);
		
		//Parameterized method calling and assigning it to the instance variable
		int t = obj2.substraction(10);
		System.out.println("Print t " +t);
		
		int g = 10 * obj2.substraction(5);
		System.out.println("Print g " +g);
	}

	public void addition() {
		int a = 10, c;
		c = a + b;
		System.out.println(c);
	}
	
	public int substraction(int e) {
		int b = 50;
		int f = b - e;
		System.out.println("print f " +f);
		//Manipulating the final variable declared inside the parameterized constructor
		f = this.b - e;
		return f;
		
	}
		
	
}
