package java_example_180529;

public class ch7_09_car {
	//필드
	//각 필드는 ch7_09_tire 클래스 타입으로 선언됨(객체)
	/*ch7_09_tire frontLeftTire = new ch7_09_tire("앞 왼쪽", 6);
	ch7_09_tire frontRightTire = new ch7_09_tire("앞 오른쪽", 2);
	ch7_09_tire rearLeftTire = new ch7_09_tire("뒤 왼쪽", 3);
	ch7_09_tire rearRightTire = new ch7_09_tire("뒤 오른쪽", 4);*/
	//위의 내용을 배열로
	//ch7_09_tire 클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	public static ch7_09_tire frontLeftTire = new ch7_09_tire("앞왼쪽", 6);
	public static ch7_09_tire frontRightTire = new ch7_09_tire("앞오른쪽", 2);
	public static ch7_09_tire rearLeftTire = new ch7_09_tire("뒤 왼쪽", 3);
	public static ch7_09_tire rearRightTire = new ch7_09_tire("뒤 오른쪽", 4);
	ch7_09_tire[] tire = new ch7_09_tire[100];
	ch7_09_tire[] tire1 = {};
	ch7_09_tire[] tire2 = {
			new ch7_09_tire("앞 왼쪽", 6),
			new ch7_09_tire("앞 오른쪽", 2),
			new ch7_09_tire("뒤 왼쪽", 3),
			new ch7_09_tire("뒤 오른쪽", 4),
	};
	
	/*tire2[0] = new ch7_09_tire("앞왼쪽", 6);
	tire2[1] = new ch7_09_tire("앞 오른쪽", 2);
	tire2[2] = new ch7_09_tire("뒤 왼쪽", 3);
	tire2[3] = new ch7_09_tire("뒤 오른쪽", 4);*/
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(rearLeftTire.roll()==false) {stop(); return 3;}
		if(rearRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
	
}
