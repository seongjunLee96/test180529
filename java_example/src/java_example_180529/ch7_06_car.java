package java_example_180529;

public class ch7_06_car {
	//필드, 메소드,  final 메소드
	
	public int speed;
	
	public void speedUp() {
		speed += 10;
	}
	
	//final 메소드 
	public final void stop () {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
