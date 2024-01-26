package constructor;

public class ConstructorPractice_Inheritance extends Parent1 {
	
	public ConstructorPractice_Inheritance() {
//		System.out.println("I am child class default constructor");
		super();
		System.out.println("I am child class default constructor");
	}
	
	public ConstructorPractice_Inheritance(int a) {
//		super()  always present implicitly, parent class default constructor calling
//		super(20);
//		super("Sathya");
//		super('a'); 
//		ConstructorPractice_Inheritance();
//		this();
//		this('p');
		System.out.println("I am int parameterized child constructor");
	}
	
	public ConstructorPractice_Inheritance(char ch) {
//		this();
		super(20);
//		this();
		System.out.println("I am char parameterized child class constructor");
	}

	public static void main(String[] args) {
//		ConstructorPractice_Inheritance obj = new ConstructorPractice_Inheritance();
		
		ConstructorPractice_Inheritance obj1 = new ConstructorPractice_Inheritance(20);
		
//		ConstructorPractice_Inheritance obj2 = new ConstructorPractice_Inheritance('a');
	}

}

class Parent1 {
	
	public Parent1() {
		System.out.println("I am parent1 default constructor");
	}
	
	public Parent1(int v) {
		System.out.println("I am parent1 class int parameterized constructor");
	}
	
	public Parent1(String v) {
//		this(10);
//		this();
		System.out.println("I am parent1 class String parameterized constructor");
		
		
	}
	
}
