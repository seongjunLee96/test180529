package java_example_180524;
//static 필드, 메소드 사용
public class ch6_11_calculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * ch6_11_calculator.pi;
		int result2 = ch6_11_calculator.plus(10, 10);
		int result3 = ch6_11_calculator.minus(10, 10);		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
