package day04;

import javax.swing.JOptionPane;

public class InputTest3 {
	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
//		JOptionPane.showMessageDialog(null, name);
		int num1 = 0, num2 = 0;

		String arNums [] = null;
		arNums = JOptionPane.showInputDialog("ù��° ������ �ι�° ������ �Է��ϼ���").split(",");
		
		num1 = Integer.parseInt(arNums[0]);
		num2 = Integer.parseInt(arNums[1]);
		
		JOptionPane.showMessageDialog(null, "����� : "+(num1+num2));
		
	}
}








