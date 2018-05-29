package java_example_180516;
//문자열 연결 연산자 87p
public class ch3_stringconcatExample {

	public static void main(String[] args) {
		//String 문자열을 저장할 수 있는 타입
		String str1 = "JDK" + 8.0 ;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //뒤에 숫자는 문자열로 인식
		String str4 = 3 + 3.0 + "JDK";  // 숫자로 인식
		System.out.println(str3);
		System.out.println(str4);
	}

}
