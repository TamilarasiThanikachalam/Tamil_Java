package practiceBasicsOfJava;

public class ReturnPractice {

	public static void main(String[] args) {
		ReturnPractice r = new ReturnPractice();
		r.methodWithoutReturnType(20);
		//System.out.println(r);
		r.methodWithoutReturnType(50);
		String str2 = "Tamil";
		String str3 = str2 + methodWithReturnType(30);
		System.out.println(str3);
		
		}
// Below int a value can be changed anytime - called in the main function
	public void methodWithoutReturnType(int a) {
		System.out.println("MethodWithoutReturnType");
		System.out.println(a);
		methodWithReturnType(100);
						
	}
//Returned the manipulated value str4 to the main method and performed one more operation in it.
	//Using return we can re-use the processed data in another method.
	public static String methodWithReturnType(int b) {
		String str = "Tamil";
		String str1 = "Mithran";
		String str4 = str + str1;
		return str4;
		
		
		
	}
}
