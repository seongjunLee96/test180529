package java_example_180529;
//자동타입변환 예제 (자식클래스타입 ->부모클래스 타입)

//A클래스 선언
class A {
	
}

//A클래스의 자식클래스인 B클래스 선언
class B extends A {
	
}

//A 클래스의 자식클래스인 C클래스 선언
class C extends A{
	
}
//B클래스의 자식클래스인 D클래스 선언
class D extends B{
	
}

//C클래스의 자식클래스인 E클래스 선언
class E extends C{
	
}

public class ch7_08_promotionExample {

	public static void main(String[] args) {
		//B클래스 타입 변수 b선언
		B b = new B();
		//C클래스 타입 변수 c선언
		C c = new C();
		//D클래스 타입 변수 d선언
		D d = new D();
		//E클래스 타입 변수 e선언
		E e = new E();
		
		//각각 선언한 변수들에 대한 자동  형변환 여부 확인
		
		//A클래스 타입의 변수(a1)에 B클래스 타입 변수 대입
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		//B클래스 타입의 변수(b1)에 D클래스 타입 변수(d) 대입
		B b1 = d;
		C c1 = e;
		
		/*B b2 = e;
		C c2 = d;
		
		B b3 = (B) a1;*/
		
	}

}




