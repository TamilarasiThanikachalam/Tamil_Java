package practiceBasicsOfJava;

public class ReturnPractice2 {

	public static void main(String[] args) {
		ReturnPractice2 rtr = new ReturnPractice2();
		int t = rtr.addTwoNumber(10, 20);
		System.out.println(t);
		
		int d = 10 + rtr.addTwoNumber(20, 20);
		System.out.println(d);
		
		String str3 = "Mithran" +combineTwoString();
		String str4 = str3 +combineTwoString();
		System.out.println(str3);
		System.out.println(str4);
				

	}
	//Non-static Method with parameters and Return Type

	public int addTwoNumber(int a, int b) {
		int c = a + b;
		return c;
			
	}
	//Static Method without parameters and return type
	
	public static String combineTwoString() {
		String str,str1 = "Tamil" , str2 = "Mithran" ;
		str = str1 + str2;
		return str;
		
		
		
	}

}
