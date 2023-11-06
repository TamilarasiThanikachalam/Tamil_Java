package basicsOfJava;

public class ReturnTypeTesting {

	public static void main(String[] args) {
		ReturnTypeTesting obj = new ReturnTypeTesting();
		obj.buySoap1();
		obj.buySoap("Lux");
		
		obj.buySoap2("abc");
		System.out.println(obj.buySoap2("abc"));
		
		String theSoap = null;
		System.out.println(theSoap);
		theSoap = obj.buySoap2("abc");
		System.out.println(theSoap);
		
		obj.buySweets(100);
		
		obj.buySoap3(100, "Lux", 25);
		
		obj.buySweets(obj.buySoap3(100, theSoap, 70));

	}
	
	public void buySoap(String soapName) {
		System.out.println("Bought soap "+soapName);
	}
	
	public void buySoap1() {
		System.out.println("Bought Hamam soap");
	}
	
	public String buySoap2(String soapName) {
		
		return soapName;
	}
	
	public int buySoap3(int givenAmount, String soapName, int soapAmount) {
		int balance = givenAmount - soapAmount;
		return balance ;
	}
	
	public void buySweets(int amount ) {
		System.out.println("Sweets for "+amount);
	}

}
