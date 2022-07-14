package day04;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name = "";
		String lastName = "";
		Scanner sc = new Scanner(System.in);
		//A.b : A안에 b
		System.out.println("이름이 뭐니?");
		name = sc.nextLine();
//		name = sc.next();
//		lastName = sc.next();
		System.out.println(name);
//		System.out.println(lastName);
		
	}
}
