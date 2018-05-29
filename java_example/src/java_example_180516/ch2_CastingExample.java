package java_example_180516;
//예제 p.53
public class ch2_CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		//기존int 타입의 변수가 char 타입으로 강제 타입변환 발생
		char charValue = (char) intValue;
		System.out.println(charValue);
		//
		long longValue = 500;
		//기존long 타입의 변수가 int 타입으로 강제 타입변환 발생
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		//기존double 타입의 변수가 int 타입으로 강제 타입변환 발생
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
