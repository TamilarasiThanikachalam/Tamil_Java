package constructor;

public class TestC {
	
	final int interest ;
	
	public TestC(int a ) {
		int aa = 10;
		interest = a;
		System.out.println("a");
		m1();
		m2();
	
	}

	public static void main(String[] args) {
		TestC homeLoan = new TestC(10);
		
		TestC personalLoan = new TestC(13);
		}
	
	public void m1() {
		
	}
	
	public static void m2() {
		
	}

}


class ClassB {
	
	public void processHomeLoan() {
		
		TestC homeLoan = new TestC(10);
		homeLoan.interest = 20;
	}
	
}
