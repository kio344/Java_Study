package single;

import java.util.Calendar;

/*��Ű���� .�� ����ϸ� ������ �ϳ� �� ����� ����.
 * a.b.c.d
 * a���� �ȿ� b���� �ȿ� c���� �ȿ� d
 */
public class SingleMain {
	public static void main(String[] args) {
		day26.Single s = day26.Single.getInstance();
		s.sayHello();
		Calendar c = Calendar.getInstance();
	}
}
