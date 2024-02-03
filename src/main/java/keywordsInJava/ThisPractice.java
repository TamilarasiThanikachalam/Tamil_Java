package keywordsInJava;

public class ThisPractice extends ThisParent{
	
	String str = "Mithran";
	
	public ThisPractice() {
		
		System.out.println("Child class default Condtructor");
	}
	
public ThisPractice(String str) {
//	    this();
		System.out.println(this.str);
		System.out.println(str);
		System.out.println("Child class String paraneterized Condtructor");
	}
	public void thisPractice() {
		System.out.println("Child Class method");
	}

	
	public static void main(String[] args) {
		ThisPractice obj = new ThisPractice();
		obj.thisPractice();
		
		ThisPractice obj1 = new ThisPractice("Tamil");
		obj1.thisPractice();
		
//		ThisParent obj2 = new ThisPractice();
//		obj2.thisPractice();
		
		
		
		
	}

	}
class ThisParent {
	
	public ThisParent() {
		
		System.out.println("Parent Default Constructor");
	}
	
public ThisParent(String Str1) {
		
		System.out.println("Parent String parameterized Constructor");
	}
	public void thisPractice() {
		System.out.println("Parent Class method");
	}
}

