package day28;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class WhySet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<>(SIZE);
		final Set<Integer> hashSet = new HashSet<>(SIZE);
		final int data = 9_000_000;
		
		//순차 병렬 집계연산
		IntStream.range(0,  SIZE).forEach(value ->{
			arrayList.add(value);
			hashSet.add(value);
		});
		
		//끝시간 - 시작시간 = 걸린시간
		Instant start = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long eTime = Duration.between(start, end).toMillis();
		System.out.println("array list search time : "+ (eTime/1000.0)+"초");
		
		start = Instant.now();
		hashSet.contains(data);
		end = Instant.now();
		eTime = Duration.between(start, end).toMillis();
		System.out.println("hash set search time : "+ (eTime/1000.0)+"초");
		
	}
}
