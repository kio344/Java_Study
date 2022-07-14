package day24;

import java.util.Date;

/**
 * This One is Calculator
 * 
 * @author TED
 *	@since 2019 06 12
 */
public class Calc {
	/**
	 * To add the following numbers.<br>
	 * For example<br>
	 * add(1, 3) return 4
	 * 
	 * @param num1 : First Integer for add
	 * @param num2 : Last Integer for add
	 */
	public static void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	//나눗셈 메서드(try catch)
	/**
	 * Divide num1 by num2.<br>
	 * You can see a Message "Divide by zero"<br>
	 * if you give num2 zero<br>
	 * 
	 * For example
	 * div(10, 5) : 2<br>
	 * div(10, 0) : "Divide by zero"<br>
	 * 
	 * @param num1
	 * @param num2
	 * @return void
	 */
	public static void div(int num1, int num2) {
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}
	}
	
	public static void main(String[] args) {
		Calc.add(1, 3);
	}
	
}









