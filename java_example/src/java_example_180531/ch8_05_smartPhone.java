package java_example_180531;

public class ch8_05_smartPhone extends ch8_05_PDA implements ch8_05_mobilePhoneInterface, ch8_05_MP3Interface{

	@Override
	public void turnOnMusic() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void turnOffMusic() {
		System.out.println("음악을 정지합니다.");
	}

	@Override
	public void sendMessage() {
		System.out.println("메세지를 송신합니다.");
	}

	@Override
	public void receiveMessage() {
		System.out.println("메세지를 수신합니다.");
	}


	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}
	
}
