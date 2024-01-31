
package overridingPractice;
//Child class
public class OverridingExample extends OverrideParentClass{

	public static void main(String[] args) {
//		This is called overriding. Here we create Object for child with parent as Reference. 
//		We expect parent method to run but during run time, JVM will pick child class method
		
		OverrideParentClass obj = new OverridingExample();
		obj.parent();
// Here even we access the static method using object it is calling the parent method. hence, Overriding not possible in static methods		
		obj.parent2();
	}
//Child class method with same method name as in the parent class
		public void parent() {
			System.out.println("ChildMethod");
			
		}
		public static void parent2() {
			System.out.println("ChildMethod2");
		}

	}

//Parent class
class OverrideParentClass{
//Parent class method
	public void parent() {
		System.out.println("ParentMethod");
	}
	public static void parent2() {
		System.out.println("ParentMethod2");
	}
}


//We cannot override static method.
//Because Overriding is mainly depends on Object creation and we cannot create Object to call static method.