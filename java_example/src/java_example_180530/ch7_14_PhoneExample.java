package java_example_180530;

public class ch7_14_PhoneExample {

	public static void main(String[] args) {
		//자식클래스의 객체 생성
		ch7_14_smartPhone smartphone = new ch7_14_smartPhone("소유자");
		
		//추상클래스의 객체 생성
		//ch7_14_phone phone = new ch7_14_phone("소유자");
		
		smartphone.turOn();
		smartphone.turOff();
		smartphone.internetSerch();
	}

}
