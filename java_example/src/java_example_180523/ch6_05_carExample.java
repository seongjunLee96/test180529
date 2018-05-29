package java_example_180523;

public class ch6_05_carExample {

	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_car c1 = new ch6_05_car();
		System.out.println(c1.model);
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_car c2 = new ch6_05_car("벨로스터");
		System.out.println(c2.model);
		//3. model, color 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_car c3 = new ch6_05_car("i30", "blue");
		System.out.println(c3.model + c3.color);
		//4. model, color,maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_car c4 = new ch6_05_car("i30N", "skyblue", 299);
		System.out.println(c4.model + c4.color + c4.maxSpeed);
		ch6_05_car c5 = new ch6_05_car();
		System.out.println(c5.model + c5.color + c5.maxSpeed);
	}

}