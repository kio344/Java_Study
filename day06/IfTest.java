package day06;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1Msg = "첫번째 정수 : ";
		String n2Msg = "두번째 정수 : ";
		int num1 = 0,  num2 = 0;
		
		System.out.println(n1Msg);
		num1 = sc.nextInt();
		
		System.out.println(n2Msg);
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("첫번째 정수가 더 큽니다.");
		}else if(num2 == num1) {
			System.out.println("두 수가 같습니다.");
		}else {
			System.out.println("두번째 정수가 더 큽니다.");
		}
		
		
	}
}






