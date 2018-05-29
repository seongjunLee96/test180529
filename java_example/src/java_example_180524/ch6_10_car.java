package java_example_180524;

public class ch6_10_car {
	//필드 선언
//	int speed = 10;
	String model;
	
	//생성자 선언
	//생성자의 이름은 클래스와 동일하게 선언
	//매개변수가 있는 생성자
	ch6_10_car (String model) {
		this.model = model;
	}
	
	//메소드 선언
	void run() {
		for(int speed = 10 ; speed <= 50 ; speed += 10) {
			System.out.println(this.model + "가 달립니다.(시속 :" + speed + "km/h)");
		}
		/*while(true) {
			if (speed <= 50) {
				System.out.println(this.model + "가 달립니다.(시속 :" + speed + "km/h)");
				speed += 10;
			}
			else
				return;	//종료의 의미
		}*/

	}
	
}
