package day30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ArrayList, LinkedList, HashMap 성능 체험 입력, 탐색, 삽입, 삭제 동작에 대한 성능
 *
 */
public class TimeComp {

	static final int SIZE = 5_000_000; // 테스트할 데이터 크기
	static Integer[] searchValues = new Integer[4990];
	static Integer[] testArray = new Integer[SIZE];

	public static void main(String[] args) {
		// 테스트 데이터 초기화
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}

		for (int i = 0; i < searchValues.length; i++) {
			searchValues[i] = i * 1000; // 0, 1000, 2000, ... 4989000 (4990개의 데이터)
		}

		testArrayList();
		testLinkedList();
		testHashMap();

	} // end main

	public static void testArrayList() {
		System.out.println("[ArrayList]");
		ArrayList<Integer> list = new ArrayList<Integer>();
		long start = 0, end = 0;

		// 입력
		System.out.print("입력 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 개의 데이터
			list.add(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// 조회/탐색
		System.out.print("탐색소요시간 : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		
		// 삽입
		System.out.print("삽입소요시간 : ");
		start = System.currentTimeMillis();
		for (int i = 0; i < searchValues.length; i++) {
			list.add(searchValues[i], -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// 삭제
		System.out.print("삭제 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.remove(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

	}

	public static void testLinkedList() {
		System.out.println("[LinkedList]");
		LinkedList<Integer> list = new LinkedList<Integer>();
		long start = 0, end = 0;

		// 입력
		System.out.print("입력 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 개의 데이터
			list.add(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// 조회/탐색
		System.out.print("탐색소요시간 : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// 삽입
		System.out.print("삽입소요시간 : ");
		start = System.currentTimeMillis();
		for (int i = 0; i < searchValues.length; i++) {
			list.add(searchValues[i], -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// 삭제
		System.out.print("삭제 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.remove(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

	}

	public static void testHashMap() {
		System.out.println("[HashMap]");
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		long start = 0, end = 0;

		// 입력
		System.out.print("입력 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 개의 데이터
			hmap.put(e, e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// 조회/탐색
		System.out.print("탐색소요시간 : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			hmap.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// 삽입
		System.out.print("삽입소요시간 : ");
		start = System.currentTimeMillis();
		for (int i = 1; i <= searchValues.length; i++) {
			hmap.put(-i, -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// 삭제
		System.out.print("삭제 소요시간: ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			hmap.remove(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

	}

} // end class








