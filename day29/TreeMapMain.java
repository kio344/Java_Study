package day29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		System.out.println("TreeMap Ŭ����");
		
		// TreeMap<Integer, String> ����
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		// ������ ���� : put(key, value) ���
		tmap.put(3, "AAA");
		tmap.put(4, "asdf");
		tmap.put(1, "aaa");
		tmap.put(2,  "qwert");
		
		// values() : value ��θ� �̷���� Collection ����
		System.out.println("values()");
		for(String value : tmap.values()) {
			System.out.println(value);
		}
		
		// ������ �˻� : get(key) ���
		// 1. Ű����θ� �̷���� Set ����
		Set<Integer> kset = tmap.keySet();
		// 2. keySet�� ������ Iterator ����
		Iterator<Integer> itr = kset.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + ":" + tmap.get(key));
		}
		
		
		// key �������� ���
		System.out.println();
		NavigableSet<Integer> navi = tmap.navigableKeySet();
		Iterator<Integer> itr2 = navi.descendingIterator();
		while(itr2.hasNext()) {
			int key = itr2.next();
			System.out.println(key + " : " + tmap.get(key));
		}
		
		// HashMap --> TreeMap ��ȯ�ϱ�
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("�������", 10000);
		hmap.put("������", 1000);
		hmap.put("���Ӵ�", 50000);
		
		TreeMap<String, Integer> tmap2 = new TreeMap<String, Integer>(hmap);
		
		for(Map.Entry<String, Integer> e : tmap2.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		
		

	} // end main

} // end class
