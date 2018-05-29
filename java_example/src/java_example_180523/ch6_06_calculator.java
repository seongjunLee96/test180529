package java_example_180523;
//method 연습 예제 217p
public class ch6_06_calculator {
	/*
	 * method 선언
	 * 메소드 이름 : poweron
	 * 메소드 리턴 타입 : void
	 */
	void poweron() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
}
