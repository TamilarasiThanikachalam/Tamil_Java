package exceptionPractice;

public class TryCatchBlock {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
