package day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		//과일
		HashMap<String, Integer> fruitMap = new HashMap<>();
		Collection<Integer> price = null;
		ArrayList<Integer> arPrice = new ArrayList<>();
		int total = 0;
		double avg = 0.0;
		
		fruitMap.put("사과", 1000);
		fruitMap.put("배", 2000);
		fruitMap.put("자두", 3000);
		fruitMap.put("수박", 4000);
		
		System.out.println(fruitMap.get("자두")+"원");
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		for (int i : price) {
			System.out.println(i+"원");
		}
		
		price.forEach(data -> arPrice.add(data));
		System.out.println(arPrice);
		
		Set<Entry<String, Integer>> set= fruitMap.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = iter.next();
			System.out.println("과일 이름 : "+e.getKey() + ", 가격 : "+e.getValue()+"원");
			total += e.getValue();
		}
		avg = Double.parseDouble(String.format("%.2f", (double)total/fruitMap.size()));
		System.out.println("평균 가격 : "+avg+"원");
	}
}









