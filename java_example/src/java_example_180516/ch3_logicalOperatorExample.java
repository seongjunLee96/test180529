package java_example_180516;
//논리연산자

/*논리연산은 true, flase를 가지고 연산을 수행함
AND 연산(&&)
(A&&B) : A,B 모두 true면 결과는 true 하나라도  false만 결과는 false
OR 연산(||)
*/
public class ch3_logicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode >=65) && (charCode<=90)) {
			System.out.println("대문자이군요");
		}
		if((charCode >=97) && (charCode<=122)) {
			System.out.println("소문자이군요");
		}
		if((charCode <48) &&! (charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}
		int value = 6;
		if((value %2 == 0) || (value %3 == 0)) {
			System.out.println("2또는 3의 배수 이군요.");
		}

	}

}
