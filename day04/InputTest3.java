package day04;

import javax.swing.JOptionPane;

public class InputTest3 {
	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("이름을 입력하세요");
//		JOptionPane.showMessageDialog(null, name);
		int num1 = 0, num2 = 0;

		String arNums [] = null;
		arNums = JOptionPane.showInputDialog("첫번째 정수와 두번째 정수를 입력하세요").split(",");
		
		num1 = Integer.parseInt(arNums[0]);
		num2 = Integer.parseInt(arNums[1]);
		
		JOptionPane.showMessageDialog(null, "결과값 : "+(num1+num2));
		
	}
}








