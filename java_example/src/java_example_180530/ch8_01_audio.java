package java_example_180530;

public class ch8_01_audio implements ch8_01_remoteControl{
	//필드선언
	private int volume;
	boolean mute;
	//인터페이스에서 선언한 turnOn 실제 메소드 선언
	@Override
	public void turnon() {
		System.out.println("audio를 켭니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>ch8_01_remoteControl.MAX_VOLUME)
			this.volume = ch8_01_remoteControl.MAX_VOLUME;
		else if(volume < ch8_01_remoteControl.MIN_VOLUME)
			this.volume = ch8_01_remoteControl.MIN_VOLUME;
		else 
			this.volume = volume;
		System.out.println("현재 audio 볼륨 : " + volume);
	}
	//인터페이스에서 정의한 디폴트 메소드를 재정의 할 때
	//접근제한자를 default에서 public으로
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute)
			System.out.println("Audio를 무음처리 합니다.");
		else
			System.out.println("Audio를 무음 해제합니다.");
	}
	
	
	
}
