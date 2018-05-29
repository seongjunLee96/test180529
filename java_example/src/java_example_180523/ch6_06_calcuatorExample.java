package java_example_180523;

public class ch6_06_calcuatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성

		ch6_06_calculator myCalc = new ch6_06_calculator();
		//powerOn 메소드 호출
		myCalc.poweron();
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		int result1 = myCalc.plus(10, 20); //호출 결과는 30
		System.out.println(result1);
		//divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		double result2 = myCalc.divide(10, 20);
		System.out.println(result2);
		//poweroff 메소드 호출
		myCalc.poweroff();


		
		
	}

}
