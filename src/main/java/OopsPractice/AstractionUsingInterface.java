package OopsPractice;

public class AstractionUsingInterface implements TestInterface{

	public static void main(String[] args) {

		AstractionUsingInterface Obj = new AstractionUsingInterface();
		Obj.method11();
		
		TestInterface.method12();

	}

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}

}


interface TestInterface{
	
	public void method11();
	
	public static void method12() {
		System.out.println("Interface static method");
	}
	
	
	
}
