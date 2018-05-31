package java_example_180530;

public class ch7_13_instanceofExample {
	
	/*
	 * method1의 매개변수 : Parent클래스 타입의 변수 parent
	 */
	public static void method1(ch7_13_parent parent) {
		//parent 변수가 ch7_13_child 클래스 타입인가??
		if(parent instanceof ch7_13_child) {
			//parent 변수를 child 클래스타입으로 강제형변환해서 
			//child 클래스 타입의 변수 child에 대입한다.
			ch7_13_child chid = (ch7_13_child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	//강제 형변환이 가능한지 여부를 묻지 않고 강제 형변환 수행하는 메소드
	public static void method2(ch7_13_parent parent) {
		ch7_13_child child = (ch7_13_child) parent;
		System.out.println("method1 - child로 변환 성공");
	}
	
	public static void main(String[] args) {
		/*
		 * 객체 타입 확인을 위한 instanceof 연산자
		 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자
		 */
		//parent 타입의 변수를 선언해서 child 객체를 대입
		//method1, 2를 각각 호출
		ch7_13_parent parent1 = new ch7_13_child();
		method1(parent1);//성공
		method2(parent1);//성공
		
		//parent타입의 변수를 선언해서 parent 객체를 대입
		//method1, 2를 각각 호출
		ch7_13_parent parent2 = new ch7_13_parent();
		method1(parent2);//오류는 없지만 변환은 안됨
		method2(parent2);//오류
		
	}

}
