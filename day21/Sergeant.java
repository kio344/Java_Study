package day21;

public class Sergeant extends Army{
	
	@Override
	public void play() {
		System.out.println("계속 논다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("계속 잔다.");
	}
	
	@Override
	public void salute() {
		System.out.println("ㅊ");
	}
	
}
