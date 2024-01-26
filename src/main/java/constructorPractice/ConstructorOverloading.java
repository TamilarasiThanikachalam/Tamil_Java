package constructorPractice;

public class ConstructorOverloading {
	
	private ConstructorOverloading() {
		System.out.println("Calling default Construtcor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("calling int parameterized Constructor");
	}
	protected ConstructorOverloading(String str){
		System.out.println("calling String parameterized Constructor");
		
	}
	public ConstructorOverloading(char c) {
		System.out.println("calling char parameterized Constructor");
	}

	public static void main(String args[]) {
		ConstructorOverloading Obj = new ConstructorOverloading();
		ConstructorOverloading Obj1 = new ConstructorOverloading(10);
		ConstructorOverloading Obj2 = new ConstructorOverloading("Mithran");
		ConstructorOverloading Obj3 = new ConstructorOverloading('T');
		
				
		
		
	}
}
