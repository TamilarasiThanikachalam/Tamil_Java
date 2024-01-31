package inheritancePractice;

public class InheritanceParentClass {
	
	int i = 10;
	static String s1 = "Mithran";
	
	
	public void parentmethod1() {
		System.out.println("This is non-static Parent Class Method 1");
	}
	
	
	public static int parentmethod2() {
		System.out.println("This is static Parent class method 2");
		int a = 10;
		return a;
		
	}

	public static void main(String[] args) {
		InheritanceParentClass P = new InheritanceParentClass();
		P.parentmethod1();
		
		int b = P.i + parentmethod2();
		System.out.println(b);
		
		System.out.println(parentmethod2());
		
		
		

	}

}
