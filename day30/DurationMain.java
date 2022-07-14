package day30;

import java.time.Duration;
import java.time.Instant;

/* 경과시간 (Elapsed Time, Lap Time, Duration) 체크하기
 * 
 * 알고리즘의 성능, 프로그램의 성능을 가늠하는 
 * 대표적인 두가지 척도는
 * 	시간복잡도 (Time Complexity)  : 얼마나 시간이 많이 걸리나? 
 * 	공간복잡도 (Space Complexity) : 얼마나 많은 메모리를 소모하나?
 * 
 * 시간복잡도, 즉 수행 '경과시간'을 정밀하게 체크하려면
 * 연월일시분초 개념의 시간보다는 그보다 더 정밀한 시간, 가령 ms, ns 단위로 체크해봐야 한다.
 * 
 */
public class DurationMain {

	public static void main(String[] args) {
		
		
		System.out.println("프로그램 시작");
		
		// 연월일시분초 개념의 시간이 아니고, 현재의 '시점' 을 알고 싶을때.
		long milliSec = System.currentTimeMillis();    // 현재 시간을 millisecond 로 리턴 (long)   1/1000
		long nanoTime = System.nanoTime();   // JVM 시간을 nanoseconds 로 리턴 (long)   1/1,000,000,000 초
		Instant now = Instant.now();   // JAVA8 등장, UTC 기준 현재시작정보를 담고 있는 java.time.Instant 객체 리턴
		
		System.out.println(milliSec);
		System.out.println(nanoTime);
		System.out.println(now);
		
		
		// 경과시간 체크
		long startTime;
		long endTime;
		long lapTime;
		
		System.out.println("1] currentTimeMillies() 사용");
		
		startTime = System.currentTimeMillis(); // 시작시간 체크
		Instant startInstant = Instant.now();
		try {
			Thread.sleep(2000);  // 2000ms 딜레이 발생
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		endTime = System.currentTimeMillis();  // 종료시간 체크
		Instant endInstant = Instant.now();
		
		lapTime = endTime - startTime;  // 경과 시간 계산
		System.out.println("경과시간 (ms) : " + lapTime);
		
		lapTime = Duration.between(startInstant, endInstant).toMillis();
		System.out.println("경과시간 (ms) : " + lapTime);
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
		
		
		

	}

}
