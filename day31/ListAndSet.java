package day31;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
/*
 * Set�� �˻��� ������ �ֱ� ������ ���� ������ ������ �ʿ䰡 ���
 * ������ ũ�⿡ ������� �˻��� �ɸ��� �ð��� �ſ� ª��.
 * �ݸ� List�� index�� �����ؾ� �ϱ� ������ ��������� �ð��� ���� �ɸ���.
 * 
 * �׷��Ƿ� ����� ���̰� ���ٸ� HashSet�� ����Ѵ�.
 * 
 */
public class ListAndSet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<>(SIZE);
		final Set<Integer> hashSet = new HashSet<>(SIZE);
		final int data = 9_000_000;
		
		//���� ���� ���迬��
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});		
		
		Instant start = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long time = Duration.between(start, end).toMillis();
		System.out.println("arrayList �˻� �ð� : "+(time/1000.0)+"��");
		
		start = Instant.now();
		hashSet.contains(data);
		end = Instant.now();
		time = Duration.between(start, end).toMillis();
		System.out.println("hashSet �˻� �ð� : "+(time/1000.0)+"��");
		
	}
}














