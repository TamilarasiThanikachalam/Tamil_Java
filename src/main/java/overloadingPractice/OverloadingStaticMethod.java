package overloadingPractice;

public class OverloadingStaticMethod {
	//Overloading - same method name with different parameters and happens within class.
	//Compile time polymorphism
	//Based on method signature - Methodname with or without parameters
	
	
	//Type of parameters
		public static void parameterType(int a) {
		System.out.println("parameter Type as int "  +a);
	}
		public static void parameterType(String str) {
		System.out.println("Parameter Type as String "  +str);
	}
	
	//Number of parameters
		public static void getText(String text1) {
		System.out.println("getText method with one parameter "  + text1);
		
	}
	public static void getText(String text1, String text2) {
		System.out.println("getText method with two parameter "  + text1 +  " and "  + text2 );

	}
	
	//Order of parameters
	public static void orderOfParameters(int a, String b) {
		System.out.println("Order of paramerters with int and string "  + a + "  " + b);
	}
	public static void orderOfParameters(String b, int a) {
		System.out.println("Order of parameter with String and int "  + b + "  " + a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "Mithran";
		String text2 = "Tamil";
		System.out.println("Static Method Overloading");
		
		OverloadingStaticMethod.parameterType(100);
		OverloadingStaticMethod.parameterType(text1);
		
		OverloadingStaticMethod.getText(text1);
		OverloadingStaticMethod.getText(text1, text2);
		
		OverloadingStaticMethod.orderOfParameters(10, "Tamil");
		OverloadingStaticMethod.orderOfParameters("Sathya", 20);

	}

}

//Ouput:
//Static Method Overloading
//parameter Type as int 100
//Parameter Type as String Mithran
//getText method with one parameter Mithran
//getText method with two parameter Mithran and Tamil
//Order of paramerters with int and string 10  Tamil
//Order of parameter with String and int Sathya  20


