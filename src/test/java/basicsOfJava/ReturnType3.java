package basicsOfJava;

public class ReturnType3 {
	
	static int returnedValue;

	public static void main(String[] args) {
		ReturnType3 obj = new ReturnType3();
//		returnedValue = obj.buySoap();
//		returnedValue = 50;
		obj.method1();
		
		obj.method3(100);
		System.out.println("*******"+returnedValue);
		
		obj.method4();
		System.out.println("&&&&&&&&&"+returnedValue);
	}
	
	public int buySoap() {
		int a = 50;
		return a;
	}
	
	public void method1() {
		System.out.println(buySoap());
		System.out.println(returnedValue);
	}
	
	public void method2() {
		int amount = buySoap();
		System.out.println(amount);
	}
	
	public int method3(int value) {
//		int x = value - returnedValue;
//		return x;
		return returnedValue - value;
	}
	
	public int method4() {
		returnedValue = returnedValue - 50;
		return returnedValue;
		
	}
	
	int amount;
	public void methodWithClassVariableReturnType() {
		System.out.println(amount);//0
		amount = buySoap();
		System.out.println(amount);//50
   	}
	
	public void changeClassVariableValue() {
		System.out.println(amount); //50
		amount = 51;
		System.out.println(amount);
	}
	
	

}
