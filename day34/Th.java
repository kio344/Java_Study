package day34;
/*
 * 
 * join()
 * 쓰레드 사용시 쓰레드 종료 전에 다른 로직 수행시 치명적인 예기치 못한 오류 발생
 * 그러므로 join()사용시 밑에 로직들은 쓰레드가 종료 될 때까지 기다린 후 실행 된다.
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
		
		System.out.println("main 종료");
	}
}













