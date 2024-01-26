package constructorPractice;

public class ConstructorBasic {
	
	//Default constructor written explicitly
		public ConstructorBasic() {
		System.out.println("This is the default constuctor written explicitly which doesnt have the returntype");
	}
	
	
	//Method
	public void constructorBasic() {
		System.out.println("This is the method as it has the returntype and method name starts with small letter");
		
	}
	
	public static void main(String args[]) {
		ConstructorBasic cons = new ConstructorBasic();
		cons.constructorBasic();
	}

}
