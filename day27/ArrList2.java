package day27;

import java.util.ArrayList;

public class ArrList2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//10~80까지의 값들을 10 20 30....
		//list에 add하기 (for문 사용!)
		
		for (int i = 1; i < 9; i++) {
			list.add(i*10);
		}
		
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		//indexOf() : 값이 있으면 그 값이 들어있는 방번호를 준다. 값이 없으면 -1을 준다. 
		int idx = list.indexOf(10);
		if(idx != -1) {
			list.add(idx+1, 15);
		}else {
			list.add(0, 15);
		}
		
		System.out.println(list);
		
		//실습 60을 600으로 바꾸기
		list.set(list.indexOf(60), 600);
		System.out.println(list);
		
		//실습 15 지우기!
		System.out.println(list.size());
		list.remove(new Integer(15));
		System.out.println(list);
		System.out.println(list.size());	
	}
}
