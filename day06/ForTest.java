package day06;

public class ForTest {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1+"�ѵ���");
//		}
		
		//1~100���� ���
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
		
		//100~1���� ���
		for (int i = 0; i < 100; i++) {
			System.out.println(100-i);
		}
		
		//1~100���� ¦���� ���
		
		for(int i=0; i<101; i+=2) {
			System.out.println(i);
		}
		
		//1~100���� Ȧ���� ���
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 1 ) {
				System.out.println(i);
			}
		}
		
		//1~100������ �� �� 3�� 5�� ����� ���ϱ�
		for (int i = 0; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		//A~E���� ���
//		for(int i = 0; i < 5; i++) {
////			System.out.println((char)(65+i));
//			System.out.printf("%c\n", 65+i);
//		}
		
		for(char i = 'A'; i < 'E'+1; i++) {
			System.out.println(i);
		}
		
	}
}













