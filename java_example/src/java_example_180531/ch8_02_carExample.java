package java_example_180531;

public class ch8_02_carExample {

	public static void main(String[] args) {
		ch8_02_car car = new ch8_02_car();
		
		car.run();
		System.out.println("---------------------");
		System.out.println("변수에 다른 객체 대입");
		System.out.println("---------------------");
		car.frontLeftTire = new ch8_02_kumhoTire();
		car.run();
	}

}
