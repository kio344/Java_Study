package day26;

public class Gnr {
	public static void main(String[] args) {
		GTest<String> g = new GTest<>();
		GTest<Integer> g2 = new GTest<>();
		
		g.setData("안녕");
		g2.setData(new Integer(10));
		
		System.out.println(g.getData());
		System.out.println(g2.getData());
		System.out.println(GTest2.function(3.9));
		System.out.println(GTest2.function(3.9F));
		System.out.println(GTest2.function(10));
		System.out.println(GTest2.function('B'));
		System.out.println(GTest2.function("김민호"));
	}
}
