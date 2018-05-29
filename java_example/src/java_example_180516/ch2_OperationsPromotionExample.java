package java_example_180516;
//예제 p.59
public class ch2_OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//컴파일 에러, byte형이여도 int형으로 계산됨.
		//byte byteValue3 = (byte) (byteValue1 + byteValue2); byte형으로 계산하기 위한 수식
		//byte 타입의 두 변수의 값을 더해서 int 타입으로 변환
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;	//컴파일 에러
		//char 타입의 두 변수의 값을 더해서 int 타입으로 변환.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		//int형 변수의 값을 10/4 하면 소수점 버림
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;		//컴파일 에러
		//int형 변수의 값을 10/4.0 나누고 double형으로 변환, 자동변환으로 10.0/4.0
		double doubleValue = intValue5 / 4.0;
		//double doubleValue = intValue5 / 4;	10/4 결과 2.0
		System.out.println(doubleValue);

	}

}
