package interfacePractice;

public interface InterfaceTestOne {

	int i = 10;
	final static String s = "abc";
	
	
	
	public static void printNumbers() {
		System.out.println("1,2,3....");
	}
//	public static void printChar();
	
	default void printString() {
// 	i =20;
	}
	
	public void printNumbers(int i);
	
	public static void main(String args[]) {
		InterfaceTestOne.printNumbers();
		
	}
	
}

