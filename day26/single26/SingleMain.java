package single;

import java.util.Calendar;

/*패키지명에 .를 사용하면 폴더가 하나 더 만들어 진다.
 * a.b.c.d
 * a폴더 안에 b폴더 안에 c폴더 안에 d
 */
public class SingleMain {
	public static void main(String[] args) {
		day26.Single s = day26.Single.getInstance();
		s.sayHello();
		Calendar c = Calendar.getInstance();
	}
}
