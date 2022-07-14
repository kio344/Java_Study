package day30;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
	큐 (Queue)
	
	Collection<E>
		└─ Queue<E> (Queue)
		      └─ LinkedList<E>,  PriorityQueue<E>
		      
	 	 	
FIFO 구조 : First-in-first-out
	
주요메소드
	 
	 	Throws exception 	Returns special value 
Insert 		add(e) 				offer(e) 
Remove 		remove() 			poll() 
Examine		element() 			peek() 
	                             ↑
	                             Exception 을 안내니 안전
	  
*/
public class QueueMain {

	public static void main(String[] args) {
		System.out.println("Queue");
		Queue<String> queue = new LinkedList<String>();
		
		// offer 메소드로 데이터 enqueue 
		queue.offer("넷");
		queue.offer("셋");
		queue.offer("둘");
		queue.offer("하나");
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		// poll() 로 데이터 제거 dequeue
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
	}

}













