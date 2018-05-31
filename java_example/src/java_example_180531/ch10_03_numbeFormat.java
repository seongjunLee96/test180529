package java_example_180531;

public class ch10_03_numbeFormat {

	public static void main(String[] args) {
		//numberFormatException
		//문자열을 숫자로 변환할 때 발생하는 예외
		String data1 = "100";
		String data2 = "a100";
		
		//문자열을 숫자로 변환
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}

}
