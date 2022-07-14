package day30;

import java.util.Stack;

/*
	���� (Stack)
	
	Object
	����AbstractCollection<E>
		����AbstractList<E>
			����Vector<E>
				����Stack<E>
	
LIFO ���� : last-in-first-out
	
�ֿ�޼ҵ�
	push(e)
	pop()
	peek()
	empty()
	
	�پ��� �뵵���
		: �����Ϸ� �����м�
		: �Լ� ȣ��
		: undo/redo
*/
public class StackMain {

	public static void main(String[] args) {
		
		System.out.println("Stack");
		Stack<Integer> st = new Stack<Integer>();  // ���� ����
		
		// push() �޼ҵ�� ������ ����
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);
		
		// peek() �޼ҵ带 �̿��Ͽ� top ������ Ȯ���غ���
		System.out.println(st.peek());
		System.out.println(st);
		
		// pop() �޼ҵ� �̿��� top ����� ��ȯ �� ����
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		
		// search() �� �̿��� ��ġ �˻�
		System.out.println("4�� search : " + st.search(4));
		System.out.println("2�� search : " + st.search(2));
		System.out.println("2�� search : " + st.search(100));
		
		
		
	}
	
	public static void recursive(int n) {
		System.out.println(n);
		recursive(n + 1);  // ��� ȣ�� (recursive call)
	}
	
	
	
	
	
	
	
	
	

}
