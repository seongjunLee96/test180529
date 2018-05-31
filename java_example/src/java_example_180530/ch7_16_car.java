package java_example_180530;

public abstract class ch7_16_car {
	
	//필드 선언
	protected int speed;
	protected String color;
	
	//생성자 선언
	ch7_16_car(int speed, String color){
		this.speed = speed;
		this.color = color;
	}
	
	//메소드 선언
	public abstract void load();
	
}
