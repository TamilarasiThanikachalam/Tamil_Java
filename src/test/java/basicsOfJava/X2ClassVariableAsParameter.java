package basicsOfJava;

public class X2ClassVariableAsParameter {
	
//	Class level variables
	int a = 10;
	static String str = "Sathya";

	public static void main(String[] args) {
		X2ClassVariableAsParameter Examples = new X2ClassVariableAsParameter();
		Examples.giveAmount(100);
		Examples.callAPerson("Kanmani");
		
		Examples.giveAmount(Examples.a);
		Examples.callAPerson(str);
		
//		Local variables 
		int b = 20;
		String str1 = "Karthi";
		
		Examples.giveAmount(b);
		Examples.callAPerson(str1);
	}
	
	public void giveAmount(int amount) {
		System.out.println("Give "+amount+ " rupees to Sathya");
	}
	
	public void callAPerson(String personName) {
		System.out.println("Call " +personName);
	}

}
