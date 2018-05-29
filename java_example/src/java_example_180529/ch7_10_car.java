package java_example_180529;

public class ch7_10_car {
	
	//필드 
	String color;
	int speed;
	
	//생성자
	public ch7_10_car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	//메소드
	//속도증가 메소드
	void speedUp(int speed) {
		this.speed += speed;
	}
	
	//속도 감소 메소드
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
}
