package practiceBasicsOfJava;

public class MethodsAndReturnValues
{
	String S1 = "Mithran";
	
	int I1 = 20;
	public static void main(String[] args) {
		
		String A = "TamilMithran";
		MethodsAndReturnValues Obj = new MethodsAndReturnValues();
		Obj.MethodWithOneReturnValue(A);
		Obj.MethodWithTwoReturnValue(A, Obj.I1);
		
		//Calling non-static variable/class level variable from static method - Object creation
		System.out.println(Obj.I1);
		System.out.println(Obj.S1);
		
	}
	
//	protected void MethodWithOneReturnValue(String printA) {
//		System.out.println("Goal is to Print String A" +printA+);
//	}
	
	public void MethodWithOneReturnValue(String printA) {
		System.out.println("  " +printA+ "");
//	Calling static variable from another method - Direct call
		System.out.println(S1);
	}
	protected void MethodWithTwoReturnValue(String printA, int A) {
		System.out.println("Fetching String " +printA+ " and fetching int value " +A+ " ");
	}
//	private void MethodWithTwoReturnValue1(String printA, int A) {
//		System.out.println("Fetching String " +printA+ " and fetching int value " +A+ " ");
//	}

}
