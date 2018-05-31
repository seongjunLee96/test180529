package java_example_180530;

public class ch8_01_remoteControllerExample {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 선언
		ch8_01_remoteControl rc;
		//각각의 객체를 인터페이스 타입 변수에 대입.
		//따라서 rc는 television 객체가 됨.
		rc = new ch8_01_television();
		rc.turnon();
		rc.turnoff();
		rc.setMute(true);
		
		
		//Audio 객체를 rc에 대입
		//따라서 rc는 audio객체가 됨
		rc = new ch8_01_audio();
		rc.turnon();
		rc.turnoff();
		rc.setMute(true);
		
		ch8_01_remoteControl.changeBattery();
	}

}
