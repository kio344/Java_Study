package day34;

public class Pig implements Runnable{
	
	void sound_pig() {
		System.out.println("꿀꿀");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sound_pig();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
