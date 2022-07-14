package day26;

public class Single {
	
	private Single(){}
	
	private static Single instance = new Single();

	public static Single getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("안녕");
	}
}
