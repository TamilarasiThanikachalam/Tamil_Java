package basicsOfJava;

public class VariableAsParameter {

	int a = 10;
	int soapAmount = 20;

	String str = "sathya";
	String a1 = ""; // empty
	String b1 = " "; // blank
	String c1 = "null"; // value
	String d1 = null; // null
	String e1; // null

	public static void main(String[] args) {
		VariableAsParameter obj = new VariableAsParameter();
		obj.buySoap();
		obj.buyLuxSoap();
		obj.buyHamamSoap();
		obj.buySoap("lux");
		obj.buySoap(10);
		obj.buySoap(null);
		obj.buySoap("null");
		obj.buySoap(20, "Hamam");
		obj.buySoap("Lux", 25);
		obj.buySoapAndShampoo(10, 25);

	}

	public void buySoap() {
		System.out.println("Bought soap");
	}

	public void buyLuxSoap() {
		System.out.println("Bought lux soap");
	}

	public void buyHamamSoap() {
		System.out.println("Bought Hamam soap");
	}

	public void buySoap(String soapName) {
		System.out.println("Bought "+soapName+" soap");
		System.out.println(a);
		System.out.println("The value of a is: "+a);
	}

	public void buySoap(int soapAmount) {
		int a = 10;
		System.out.println("Bought soap for amount "+soapAmount+" Rupees");
	}
	
	public void buySoap(int soapAmount, String soapName) {
		System.out.println("Bought "+soapAmount+" rupees "+soapName+" soap");
	}
	
	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Bought "+soapName+" soap for amount "+soapAmount+" rupees");
	}
	
	public void buySoapAndShampoo(int soapAmount, int shampooAmount) {
		System.out.println("Bought soap for amount "+soapAmount+" rupees");
		System.out.println("Bought shampoo for amount "+shampooAmount+" rupees");
		System.out.println("Bought soap and shampoo for amounts "+soapAmount+", "+shampooAmount+" respectively");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
