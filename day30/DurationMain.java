package day30;

import java.time.Duration;
import java.time.Instant;

/* ����ð� (Elapsed Time, Lap Time, Duration) üũ�ϱ�
 * 
 * �˰����� ����, ���α׷��� ������ �����ϴ� 
 * ��ǥ���� �ΰ��� ô����
 * 	�ð����⵵ (Time Complexity)  : �󸶳� �ð��� ���� �ɸ���? 
 * 	�������⵵ (Space Complexity) : �󸶳� ���� �޸𸮸� �Ҹ��ϳ�?
 * 
 * �ð����⵵, �� ���� '����ð�'�� �����ϰ� üũ�Ϸ���
 * �����Ͻú��� ������ �ð����ٴ� �׺��� �� ������ �ð�, ���� ms, ns ������ üũ�غ��� �Ѵ�.
 * 
 */
public class DurationMain {

	public static void main(String[] args) {
		
		
		System.out.println("���α׷� ����");
		
		// �����Ͻú��� ������ �ð��� �ƴϰ�, ������ '����' �� �˰� ������.
		long milliSec = System.currentTimeMillis();    // ���� �ð��� millisecond �� ���� (long)   1/1000
		long nanoTime = System.nanoTime();   // JVM �ð��� nanoseconds �� ���� (long)   1/1,000,000,000 ��
		Instant now = Instant.now();   // JAVA8 ����, UTC ���� ������������� ��� �ִ� java.time.Instant ��ü ����
		
		System.out.println(milliSec);
		System.out.println(nanoTime);
		System.out.println(now);
		
		
		// ����ð� üũ
		long startTime;
		long endTime;
		long lapTime;
		
		System.out.println("1] currentTimeMillies() ���");
		
		startTime = System.currentTimeMillis(); // ���۽ð� üũ
		Instant startInstant = Instant.now();
		try {
			Thread.sleep(2000);  // 2000ms ������ �߻�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		endTime = System.currentTimeMillis();  // ����ð� üũ
		Instant endInstant = Instant.now();
		
		lapTime = endTime - startTime;  // ��� �ð� ���
		System.out.println("����ð� (ms) : " + lapTime);
		
		lapTime = Duration.between(startInstant, endInstant).toMillis();
		System.out.println("����ð� (ms) : " + lapTime);
		
		
		
		
		
		
		System.out.println("���α׷� ����");
		
		
		
		

	}

}
