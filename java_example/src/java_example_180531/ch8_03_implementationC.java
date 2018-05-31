package java_example_180531;

public class ch8_03_implementationC implements ch8_03_interfaceC {

	@Override
	public void methodA() {
		//interfaceA의 메소드
		System.out.println("implementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		//interfaceB의 메소드
		System.out.println("implementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		//interfaceC의 메소드
		System.out.println("implementationC-methodC() 실행");
		
	}

}
