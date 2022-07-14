package day25;

public class Wrapper {
	public static void main(String[] args) {
		//jdk 1.5 버전 전에는 무조건 이렇게 사용해야 한다.
		String str = new String("1");
		
		//jdk 1.5이후
		String str2 = "1";//오토 박싱
		Integer data = 10;	//오토 박싱
		int data2 = data; //오토 언박싱
		
		System.out.println(str);
		
	}
}
