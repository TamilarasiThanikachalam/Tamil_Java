package exceptionLearning;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0; 
		
		try {
		System.out.println(a/b);
		}
		
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Hello");
//		}
		
		catch(NullPointerException e ) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Hiiiii");
			System.out.println(e.getLocalizedMessage());
		}
		
		finally {
			System.out.println("I always run");
		}
		
		System.out.println("The division operation worked fine");
	}


}
