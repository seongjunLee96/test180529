package java_example_180530;

public interface ch8_01_remoteControl {
	//상수 선언
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	//abstract를 붙이지 않아도 자동으로 추상메소드로 인식
	void turnon();
	void turnoff();
	void setVolume(int volume);
	
	//디폴트 메소드
	//구현 객체가 가지고 있는 메소드의 실행내용까지 작성해 놓은 것.
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제 합니다.");
	}
	
	//정적(static) 메소드
	//객체가 없어도 인터페이스에서 바로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
