package java_example_180531;

public class ch8_02_car {
	//좌변 : tire 인터페이스 타입의 변수 frontLeftTire 선언
	//우변 : 한국타이어 객체를 만듦
	ch8_02_tire frontLeftTire = new ch8_02_hankookTire();
	ch8_02_tire frontRightTire = new ch8_02_hankookTire();
	ch8_02_tire rearLeftTire = new ch8_02_hankookTire();
	ch8_02_tire rearRightTire = new ch8_02_hankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		rearLeftTire.roll();
		rearRightTire.roll();
	}
}
