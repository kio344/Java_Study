package day34;

public class Duck implements Runnable{
	
	void sound_duck() {
		System.out.println("꽥~꽥!");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sound_duck();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
