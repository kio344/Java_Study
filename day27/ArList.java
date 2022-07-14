package day27;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * �÷��� Ŭ���� �� ���� ���� ���Ǵ� Ŭ����.
 * �迭�� �̿��ؼ� ���� �����Ѵ�.
 * 
 * �ε����� �̿��ؼ� �迭 ��ҿ� ������ ���� ����������
 * ũ�⸦ �ø��� ���ؼ��� ���ο� �迭�� �����ϰ� ������ ������ �Űܾ� �ϹǷ�
 * ������.
 * 
 *�����迭 : ũ�Ⱑ �����Ǿ���
 *�����迭 : ũ�Ⱑ �����Ǿ����� �ʴ�.
 *
 *�迭 : �ӵ��� �������� ������ �޸� ������ ���� ���߿� �ø� �� ����.
 *ArrayList : �޸� ���� ����� �ø��� ���� �� ������, �迭���� ������.
 *
 */
public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = null;
		//��Ÿ����.
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
		
		System.out.println("���� �� : "+list);
		Collections.sort(list);
		System.out.println("���� �� : "+ list);
		Collections.reverse(list);
		System.out.println("�������� : "+list);

		//���� : shuffle()
		Collections.shuffle(list);
		System.out.println(list);
	
	}
}










