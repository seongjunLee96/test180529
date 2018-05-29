package java_example_180529;

public class ch7_09_carExample {

	public static void main(String[] args) {

		//ch7_09_car 클래스에 대한 객체 선언
		//ch7_09_car 클래스 타입 변수 car 선언
		ch7_09_car car = new ch7_09_car();
		
		//부모클래스 타입의 변수 선언
		ch7_09_tire tire = new ch7_09_tire("aaa",10);
		//자식클래스 타입의 변수 선언
		ch7_09_kumhoTire hktire = new ch7_09_kumhoTire("한국", 10);
		
		tire = hktire;	//자식클래스 타입 변수를 부모클래스 타입 변수에 대입
		ch7_09_hankookTire hktire1 = (ch7_09_hankookTire) tire;//부모클래스 타입 변수를 자식클래스 타입 변수에 대입, 부모타입에서 자식 부모타입으로 자동형 변환대입을 할 수 없음 (캐스팅 해야 됨)
		
		for(int i = 1; i <= 5 ; i++) {
			
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 hankookTire로 교체");
					car.frontLeftTire = new ch7_09_hankookTire("앞 왼쪽", 15);
					break;
				case 2:
					System.out.println("앞 오른쪽 kumhoTire로 교체");
					car.frontRightTire = new ch7_09_kumhoTire("앞 오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤 왼쪽 hankookTire로 교체");
					car.rearLeftTire = new ch7_09_hankookTire("뒤 왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤 오른쪽 kumhoTire로 교체");
					car.rearRightTire = new ch7_09_kumhoTire("뒤 오른쪽", 17);
					break;
			}
			System.out.println("------------------------------------");
		}
	}

}
