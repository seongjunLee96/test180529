package java_example_180516;

public class ch2_PromtionExample {

	public static void main(String[] args) {
		//byte 타입의 변수 byteValue 선언하면서 초기값 10으로 줌.
		byte byteValue = 10;
		
		int intValue = byteValue;
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변환 발생
		System.out.println(intValue);
		
		char charValue = '가';
		//기존 char 타입의 변수가 int 타입으로 자동 타입변환 발생
		intValue = charValue;
		System.out.println("가의 유니코드 =" + intValue);
		
		intValue = 500;
		//기존 int 타입의 변수가 long 타입으로 자동 타입변환 발생
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		//기존 int 타입의 변수가 double 타입으로 자동 타입변환 발생
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}

}
