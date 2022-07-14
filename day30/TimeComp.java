package day30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ArrayList, LinkedList, HashMap ���� ü�� �Է�, Ž��, ����, ���� ���ۿ� ���� ����
 *
 */
public class TimeComp {

	static final int SIZE = 5_000_000; // �׽�Ʈ�� ������ ũ��
	static Integer[] searchValues = new Integer[4990];
	static Integer[] testArray = new Integer[SIZE];

	public static void main(String[] args) {
		// �׽�Ʈ ������ �ʱ�ȭ
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}

		for (int i = 0; i < searchValues.length; i++) {
			searchValues[i] = i * 1000; // 0, 1000, 2000, ... 4989000 (4990���� ������)
		}

		testArrayList();
		testLinkedList();
		testHashMap();

	} // end main

	public static void testArrayList() {
		System.out.println("[ArrayList]");
		ArrayList<Integer> list = new ArrayList<Integer>();
		long start = 0, end = 0;

		// �Է�
		System.out.print("�Է� �ҿ�ð�: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 ���� ������
			list.add(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// ��ȸ/Ž��
		System.out.print("Ž���ҿ�ð� : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		
		// ����
		System.out.print("���Լҿ�ð� : ");
		start = System.currentTimeMillis();
		for (int i = 0; i < searchValues.length; i++) {
			list.add(searchValues[i], -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// ����
		System.out.print("���� �ҿ�ð�: ");
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

		// �Է�
		System.out.print("�Է� �ҿ�ð�: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 ���� ������
			list.add(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// ��ȸ/Ž��
		System.out.print("Ž���ҿ�ð� : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			list.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// ����
		System.out.print("���Լҿ�ð� : ");
		start = System.currentTimeMillis();
		for (int i = 0; i < searchValues.length; i++) {
			list.add(searchValues[i], -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// ����
		System.out.print("���� �ҿ�ð�: ");
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

		// �Է�
		System.out.print("�Է� �ҿ�ð�: ");
		start = System.currentTimeMillis();
		for (Integer e : testArray) { // 5000000 ���� ������
			hmap.put(e, e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		// ��ȸ/Ž��
		System.out.print("Ž���ҿ�ð� : ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			hmap.get(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// ����
		System.out.print("���Լҿ�ð� : ");
		start = System.currentTimeMillis();
		for (int i = 1; i <= searchValues.length; i++) {
			hmap.put(-i, -i);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		// ����
		System.out.print("���� �ҿ�ð�: ");
		start = System.currentTimeMillis();
		for (Integer e : searchValues) {
			hmap.remove(e);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

	}

} // end class








