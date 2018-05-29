package java_example_180529;

public class ch7_06_sportsCar extends ch7_06_car {
	//speedUp 메소드 재정의
	@Override
	public void speedUp() {
		speed += 20;
	}
	//stop 메소드 재정의
	/*@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
		
}
