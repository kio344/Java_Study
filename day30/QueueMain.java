package day30;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
	ť (Queue)
	
	Collection<E>
		���� Queue<E> (Queue)
		      ���� LinkedList<E>,  PriorityQueue<E>
		      
	 	 	
FIFO ���� : First-in-first-out
	
�ֿ�޼ҵ�
	 
	 	Throws exception 	Returns special value 
Insert 		add(e) 				offer(e) 
Remove 		remove() 			poll() 
Examine		element() 			peek() 
	                             ��
	                             Exception �� �ȳ��� ����
	  
*/
public class QueueMain {

	public static void main(String[] args) {
		System.out.println("Queue");
		Queue<String> queue = new LinkedList<String>();
		
		// offer �޼ҵ�� ������ enqueue 
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		queue.offer("�ϳ�");
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		// poll() �� ������ ���� dequeue
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
	}

}













