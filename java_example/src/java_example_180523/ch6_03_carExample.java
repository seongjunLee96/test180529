package java_example_180523;
//carExample 클래스
public class ch6_03_carExample {

	public static void main(String[] args) {
		//기본 생성자가 아닌 다른 생성자를 통해 객체 생성
		
		//String color = "검정", int cc = 300으로 필드 초기화하면서 객체 생성.
		ch6_03_car myCar = new ch6_03_car("검정", 300);
		ch6_03_car myCar1 = new ch6_03_car("빨강", 2000);
		ch6_03_car myCar2 = new ch6_03_car("흰색", 4500);
		
		//ch6_03_car myCar3 = new ch6_03_car(5000, "흰색");
	}

}
