package day07;

import java.util.Scanner;

/*
 * 1.����ϱ�
 * 2.������
 * 
 * 1 + 1
 * 2
 * 
 */
public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		int choice = 0;
		String oper = "";
		String menuMsg = "1.����ϱ�\n2.������";
		String result = "";
		
		while(true) {
			System.out.println(menuMsg);
			choice = sc.nextInt();
			if (choice == 2) break;
			if (choice != 1) continue;

			num1 = Integer.parseInt(sc.next());
			oper = sc.next();
			num2 = Integer.parseInt(sc.next());
			
			switch(oper) {
			case "+":
				result = ""+(num1+num2);
				break;
			case "-":
				result = ""+(num1-num2);
				break;
			case "*":
				result = ""+(num1*num2);
				break;
			case "/":
				if(num2 != 0) {
					result = ""+(num1/num2);
				}else {
					result = "0���� ���� �� �����ϴ�.";
				}
				break;
			default:
				result = "��Ģ���� ���� �����ڴ� ����� �� �����ϴ�.";
			}
			System.out.println(result);
		}
	}
}





