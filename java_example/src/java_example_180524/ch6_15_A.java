package java_example_180524;
//생성자의 접근제한 해제
public class ch6_15_A {
	//필드선언
	//a1, a2, a3 필드는 A클래스 타입으로 선언.
	ch6_15_A a1 = new ch6_15_A(true);
	ch6_15_A a2 = new ch6_15_A(1);
	ch6_15_A a3 = new ch6_15_A("문자열");
	
	//생성자 선언
	public ch6_15_A(boolean b) {
	}
	ch6_15_A(int b){
	}
	private ch6_15_A(String s) {
	}
}
