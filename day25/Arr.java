package day25;

public class Arr {
	
	public static void main(String[] args) {
//		String [] arData = {"�ȳ�", "�ݰ���", "�̸���", "����?"};
//		
//		for(String i : arData) {
//			System.out.println(i);
//		}
		
		int [][] arrScore = {
				{10, 20, 30},	//1��
				{11, 25, 39},//2��
				{12, 26, 38},//3��
				{13, 27, 37},//4��
				{14, 28, 36}//5��
		};
		int total = 0;
		double avg = 0.0;
		//�� �л��� ������ ��� ����ϱ�
		//���� for������
		int cnt = 0;
		for(int[] arScore : arrScore) {
			total = 0;
			cnt++;
			for(int score : arScore) {
				total += score;
			}
			System.out.println(cnt+"�� ���� : "+total+"��");
			avg = Double.parseDouble(String.format("%.2f", (double)total/arScore.length));
			System.out.println(cnt+"�� ��� : "+avg+"��");
		}
	}
}










