package java_example_180530;

public abstract class ch7_14_phone {
	//필드 선언
	public String owner;
	
	//생성자 선언
	public ch7_14_phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	public void turOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
