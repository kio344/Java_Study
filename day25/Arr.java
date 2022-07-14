package day25;

public class Arr {
	
	public static void main(String[] args) {
//		String [] arData = {"안녕", "반가워", "이름이", "뭐니?"};
//		
//		for(String i : arData) {
//			System.out.println(i);
//		}
		
		int [][] arrScore = {
				{10, 20, 30},	//1번
				{11, 25, 39},//2번
				{12, 26, 38},//3번
				{13, 27, 37},//4번
				{14, 28, 36}//5번
		};
		int total = 0;
		double avg = 0.0;
		//각 학생별 총점과 평균 출력하기
		//빠른 for문으로
		int cnt = 0;
		for(int[] arScore : arrScore) {
			total = 0;
			cnt++;
			for(int score : arScore) {
				total += score;
			}
			System.out.println(cnt+"번 총점 : "+total+"점");
			avg = Double.parseDouble(String.format("%.2f", (double)total/arScore.length));
			System.out.println(cnt+"번 평균 : "+avg+"점");
		}
	}
}










