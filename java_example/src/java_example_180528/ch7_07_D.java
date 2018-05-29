package java_example_180528;

import java_example_180529.ch7_07_A;

public class ch7_07_D extends ch7_07_A{
	/*
	 *	D클래스는 C클래스와 동일한 패키지에 선언
	 *A클래스 포함시키고 Aㅋ를래스 상속받고
	 *생성자를 선언해서 부모 클래스의 필드와 메소드에 접근가능한지 확인 
	 */
	
	public ch7_07_D() {
		super();
		
		this.field = "value";
		this.method();
	}
}
