package java_example_180523;
//CarExample 클래스
public class ch5_02_carExample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드 값을 출력해보세요.
		

		ch6_02_car myCar = new ch6_02_car();	//객체 생성
		
		//필드값 출력
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}

}
