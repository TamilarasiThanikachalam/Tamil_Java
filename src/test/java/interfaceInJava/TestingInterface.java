package interfaceInJava;

public class TestingInterface implements DummyIn {

	public static void main(String[] args) {
		TestingInterface obj = new TestingInterface();
		obj.educationLoan();
		DummyIn.eduLoan();
	}
	
	public void testMethod1() {
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buySoap(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyShampoo(String shampooName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int buySoap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String buyRice(int riceAmount) {
		// TODO Auto-generated method stub
		return null;
	}

}
