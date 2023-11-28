package gettersAndSetters;

public class GS2 extends GettersAndSetters {

	public static void main(String[] args) {
		GettersAndSetters obj = new GettersAndSetters();	
		obj.method1();
//		obj.a;
		
		System.out.println(obj.getA());
		
		System.out.println(obj.getAnotherInput());
		
		GS2 obj3 = new GS2();
		obj3.methodGS2();
		
		System.out.println(obj.getAnotherInput());
		
	}
	
	public void methodGS2() {
		GS1 obj1 = new GS1();
		obj1.methodGS1();
	}

}
