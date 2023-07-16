package interfaceInJava;

public class TestClass2 implements LearnInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rule1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rule22(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	

	public void callingConcreteMethodsOfInterface() {
		LearnInterface.rule2();
		TestClass2 obj = new TestClass2();
		obj.rule3();
		
		LearnInterface obj1 = new TestClass2(); 
//		WebDriver driver = new ChromeDriver();
		obj1.rule3();
//		obj1.test1();
	}

}
