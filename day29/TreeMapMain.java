package day29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		System.out.println("TreeMap 클래스");
		
		// TreeMap<Integer, String> 생성
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		// 데이터 저장 : put(key, value) 사용
		tmap.put(3, "AAA");
		tmap.put(4, "asdf");
		tmap.put(1, "aaa");
		tmap.put(2,  "qwert");
		
		// values() : value 들로만 이루어진 Collection 리턴
		System.out.println("values()");
		for(String value : tmap.values()) {
			System.out.println(value);
		}
		
		// 데이터 검색 : get(key) 사용
		// 1. 키값들로만 이루어진 Set 만듦
		Set<Integer> kset = tmap.keySet();
		// 2. keySet을 가지고 Iterator 만듦
		Iterator<Integer> itr = kset.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + ":" + tmap.get(key));
		}
		
		
		// key 내림차순 출력
		System.out.println();
		NavigableSet<Integer> navi = tmap.navigableKeySet();
		Iterator<Integer> itr2 = navi.descendingIterator();
		while(itr2.hasNext()) {
			int key = itr2.next();
			System.out.println(key + " : " + tmap.get(key));
		}
		
		// HashMap --> TreeMap 전환하기
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("세종대왕", 10000);
		hmap.put("이율곡", 1000);
		hmap.put("사임당", 50000);
		
		TreeMap<String, Integer> tmap2 = new TreeMap<String, Integer>(hmap);
		
		for(Map.Entry<String, Integer> e : tmap2.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		
		

	} // end main

} // end class
