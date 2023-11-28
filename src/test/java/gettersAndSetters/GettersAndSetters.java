package gettersAndSetters;

public class GettersAndSetters {
	
	private int a = 10;
	private int anotherInput;
	private int c = 20;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getAnotherInput() {
		return anotherInput;
	}

	public void setAnotherInput(int anotherInput) {
//		anotherInput = anotherInput;
		this.anotherInput = anotherInput;
	}

	public static void main(String[] args) {
		GettersAndSetters obj = new GettersAndSetters();
		System.out.println(obj.a);
		obj.method1();
	}
	
	public void method1() {
		GettersAndSetters obj = new GettersAndSetters();
		System.out.println(obj.a);
	}

}

