package java_example_180530;
//인터페이스 remoteControl의 구현 클래스
public class ch8_01_television implements ch8_01_remoteControl {
	//필드 선언
	private int volume;


	//인터페이스에서 선언한 turnOn 실제 메소드 선언.
	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다.");
	}
		
	public void setVolume(int volume) {
		if(volume>ch8_01_remoteControl.MAX_VOLUME)
			this.volume = ch8_01_remoteControl.MAX_VOLUME;
		else if(volume < ch8_01_remoteControl.MIN_VOLUME)
			this.volume = ch8_01_remoteControl.MIN_VOLUME;
		else 
			this.volume = volume;
		
		System.out.println("현재 TV 볼륨 : " + volume);
	}

}
