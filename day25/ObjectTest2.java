package day25;

public class ObjectTest2 {
	
	int data1 = 10;
	int data2 = 20;
	int data3 = 30;
	
	public ObjectTest2(int data1) {
		this.data1 = data1;
	}
	
	@Override
	public String toString() {
		return ""+data1+data2+data3;
	}
	
	public static void main(String[] args) {
		ObjectTest2 o = new ObjectTest2(90);
		char [] word = {'��', '��'};
		String data = "abc";
		
		System.out.println(data.equalsIgnoreCase("ABc"));
		
		System.out.println(o);
		System.out.println(word.toString());
		//��ü���� ����� �� �׻� �ڿ� toString()�� �����ȴ�.
		
	}
}














