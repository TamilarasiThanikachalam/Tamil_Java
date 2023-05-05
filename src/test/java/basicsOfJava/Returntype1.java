package basicsOfJava;

public class Returntype1 {
	
	String soapName = "Hamam";
	
	int balAmount;
	static int balAmt; 
	
	public static void main(String[] args) {
		Returntype1 obj = new Returntype1();
		obj.buyRice();
		obj.buySoap(100); //lux
		String boughtSoapName = obj.buySoap(100);
		System.out.println(boughtSoapName);
//		String boughtSoap = "Lux";
		obj.buySoap1(100);
		int balanceAmount = obj.buySoap1(75);
		System.out.println(obj.buySoap(100));
		obj.balAmount = obj.buySoap1(75);
		
		balAmt = obj.buySoap1(75);
		
		int reValue = obj.buySoap2(20);
	}
	
	public void buyRice() {
		System.out.println("Bought rice");
	}
	
	public int buyShampoo() {
		
		int a = 5 +6;
		
		int a1 = 10;
		int b1 = 20;
		
//		return 0;
//		return a;
		return a1+ b1;
	}
	
	
	public String buySoap(int soapAmount)  {
		
		String soapName = "Lux";
//		return "Lux";
//		return null;
//		return "";
//		return "    ";
//		return soapName;
		return soapName;
	}
	
	public int buySoap1(int givenAmount)  {
		int boughtSoapAmount = 50;
		int balanceAmount = givenAmount - boughtSoapAmount;
		System.out.println(balanceAmount);
		return balanceAmount;
	}
	
	public int buySoap2(int amount) {
		return amount;
		
	}
	
	
	
	
	
}
