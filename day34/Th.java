package day34;
/*
 * 
 * join()
 * ������ ���� ������ ���� ���� �ٸ� ���� ����� ġ������ ����ġ ���� ���� �߻�
 * �׷��Ƿ� join()���� �ؿ� �������� �����尡 ���� �� ������ ��ٸ� �� ���� �ȴ�.
 * 
 */
public class Th extends Thread{
	
	public Th(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(super.getName()+" thread. i = " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Th thread1 = new Th("first");
		Th thread2 = new Th("second");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main ����");
	}
}













