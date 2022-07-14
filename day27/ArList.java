package day27;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * 컬렉션 클래스 중 가장 많이 사용되는 클래스.
 * 배열을 이용해서 값을 저장한다.
 * 
 * 인덱스를 이용해서 배열 요소에 빠르게 접근 가능하지만
 * 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 값들을 옮겨야 하므로
 * 느리다.
 * 
 *정적배열 : 크기가 고정되었다
 *동적배열 : 크기가 고정되어있지 않다.
 *
 *배열 : 속도가 빠르지만 고정된 메모리 양으로 인해 나중에 늘릴 수 없다.
 *ArrayList : 메모리 양은 맘대로 늘리고 줄일 수 있으나, 배열보다 느리다.
 *
 */
public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = null;
		//안타깝다.
		list.add(10);	//0
		list.add(20);	//1
		list.add(80);	//2
		list.add(90);	//3
		list.add(30);	//4
		list.add(50);	//5
		list.add(40);	//6
		
		list2 = new ArrayList<>(list.subList(2, 5));
		
		System.out.println(list);
		System.out.println(list2);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		System.out.println(list.size());
		
		System.out.println("정렬 전 : "+list);
		Collections.sort(list);
		System.out.println("정렬 후 : "+ list);
		Collections.reverse(list);
		System.out.println("내림차순 : "+list);

		//섞기 : shuffle()
		Collections.shuffle(list);
		System.out.println(list);
	
	}
}










