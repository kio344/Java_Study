package day34;

public class Zoo {

	public static void main(String[] args) {
		Cat c = new Cat();
		Pig p = new Pig();
		Duck d = new Duck();
		
		Thread c_t = new Thread(c);
		Thread p_t = new Thread(p);
		Thread d_t = new Thread(d);
		
		c_t.start();
		p_t.start();
		
		try {
			c_t.join();
			p_t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d_t.start();
	}
	
}
