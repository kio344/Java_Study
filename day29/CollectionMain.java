package day29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) throws ParseException {
		System.out.println("Collection 의 메소드들");

		List<String> list1 = new LinkedList<String>();
		list1.add("김민호");
		list1.add("탁정모");
		list1.add("정민상");
		
		System.out.println(list1.toString());
		
		// sort()
		// 기본적으로 속도가 비교적 빠르고 안정성이 보장되는 Merge Sort 사용
		System.out.println("sort() 사용");
		Collections.sort(list1);
		System.out.println(list1.toString());
		
		
		// shuffle(섞기)
		System.out.println("\nshuffle()\n");
		Collections.shuffle(list1);
		System.out.println(list1.toString());
		Collections.shuffle(list1);
		System.out.println(list1.toString());
		Collections.shuffle(list1);
		System.out.println(list1.toString());

		// min(), max()
		System.out.println("min(), max()");
		List<Date> list2 = new LinkedList<Date>();
		list2.add(new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-16"));
		list2.add(new SimpleDateFormat("yyyy-MM-dd").parse("2017-05-21"));
		list2.add(new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-03"));
		System.out.println(list2.toString());
		
		System.out.println(Collections.max(list2));
		System.out.println(Collections.min(list2));
		
		
		// Comparable<T>, Comparator<>
		System.out.println();
		List<Student> list3 = new LinkedList<Student>();
		list3.add(new Student("Susie", 50));
		list3.add(new Student("James", 80));
		list3.add(new Student("Kevin", 30));
		
		System.out.println(list3.toString());
		
		Collections.sort(list3);   // 그냥은 sort 불가... Comparable<T> 가 구현되어야 사용 가능!
											// String, Date, Integer 는 이미 Comparable 이 구현되어 있는 객체다!
		
		
		System.out.println(list3.toString());
		
		// Comparator<> 적용
		System.out.println("Comparator<> 적용");
		Collections.sort(list3, new Asc());
		System.out.println(list3.toString());
		
		Collections.sort(list3, new Desc());
		System.out.println(list3.toString());
		
		
		
		
		
		
		
		
	} // end main()

} // end class


class Student implements Comparable<Student>{
	String name;
	double point;
	
	public Student(String name, double point) {
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return this.name + " : " + this.point + "점";
	}

	// compateTo() 메소드는 매개변수 객체를 현재의 객체와 비교하여 작으면 '음수', 같으면 '0', 크면 '양수'를 리턴
	@Override
	public int compareTo(Student o) {
		// 내림차순
//		if(o.point < this.point) return -1;
//		if(this.point > o.point) return 1;
//		return 0;
		
		// 오름차순
		if(o.point > this.point) return -1;
		if(this.point < o.point) return 1;
		return 0;
	}	
	
} // end Student

class Asc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}


class Desc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return -o1.name.compareTo(o2.name);
		
	}
	
}
































