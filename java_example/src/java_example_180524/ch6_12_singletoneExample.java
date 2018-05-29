package java_example_180524;

public class ch6_12_singletoneExample {

	public static void main(String[] args) {
		/*//일반적인 객체 생성하는 방식, private로 만들어서 외부에서 접근 할 수 없음. 사용	불가
		ch6_12_singleton obj2 = new ch6_12_singleton();*/
		//싱글톤으로 선언한 클래스를 사용하는 방식
		ch6_12_singleton obj1 = ch6_12_singleton.getInstance();
	}

}
