package day12;

public class Car {
	int price;
	String color;
	String brand;
	//Overloading
	Car(){}
	
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

	double speedUp(double speed){
		speed++;
		return speed;
	}
	
	double speedDown(double speed){
		speed--;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("�귣�� : "+brand+"\n���� : " + color + "\n���� : " + price + "����");
	}
	
	public static void main(String[] args) {
		//��üȭ
		//�ν��Ͻ� ����
		//Ŭ������() : �⺻ ������
		//Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������
		
		Car momCar = new Car(9000, "Black", "Benz");
		momCar.showInfo();
		Car dadyCar = new Car();
		Car myCar = new Car();
		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 9000;
//		
//		momCar.showInfo();
//		System.out.println(momCar);
//		
//		dadyCar.showInfo();
		
		
	}
	
}






