package java_example_180524;
//싱글톤 예제 244p
public class ch6_12_singleton {
	//자기자신을 객체화 해서 스태틱 함
	private static ch6_12_singleton Singleton = new ch6_12_singleton();
	
	private ch6_12_singleton() {
		
	}
	static ch6_12_singleton getInstance(){
		return Singleton;
	}
	
}
