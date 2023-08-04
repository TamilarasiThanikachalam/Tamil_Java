package constructor;

public class ConstructorUse2 {

	public static void main(String[] args) {
		ConstructorUse1 obj = new ConstructorUse1();
		obj.method2();
		
		ConstructorUse1 obj1 = new ConstructorUse1(0);
		obj1.method3();
	}

}
