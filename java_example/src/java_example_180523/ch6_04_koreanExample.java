package java_example_180523;
//koreanExmaple 클래스
public class ch6_04_koreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2 객체를 각각 생성해서 필드값을 출력해보세요.
		
		//객체생성
		ch6_04_korean k1 = new ch6_04_korean("이름", "961224");
		ch6_04_korean k2 = new ch6_04_korean("이름1", "961225");
		
		//필드값 출력
		System.out.println("이름 : " + k1.name + " 주민번호 : " + k1.ssn);
		System.out.println("이름 : " + k2.name + " 주민번호 : " + k2.ssn);
	}

}