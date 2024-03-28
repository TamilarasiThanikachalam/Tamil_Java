package exceptionPractice;

public class TryFinallyBlock {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
		}
		
		finally {
			System.out.println("Always Run");
		}

	}

}
