package gettersAndSetters;

public class GS1 {

	public static void main(String[] args) {
		GettersAndSetters obj = new GettersAndSetters();
		obj.method1();
//		obj.a; //a is not at all visible.
		
		System.out.println(obj.getA());
		
		obj.setA(20);
		System.out.println(obj.getA());
		int valueOfA = obj.getA();

		obj.setAnotherInput(1000);
		System.out.println(obj.getAnotherInput());
	}

	public void methodGS1() {
		GettersAndSetters obj = new GettersAndSetters();
		
		obj.setAnotherInput(2000);
		System.out.println(obj.getAnotherInput());
	}

}
