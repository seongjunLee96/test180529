package java_example_180530;

public class ch7_15_dog extends ch7_15_animal{
	 
	public ch7_15_dog() {
		 this.kind = "포유류";
	 }
	
	//부모클래스에서 정의된 추상메소드를 구체화
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
