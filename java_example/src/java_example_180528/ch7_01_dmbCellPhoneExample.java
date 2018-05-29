package java_example_180528;

public class ch7_01_dmbCellPhoneExample {

	public static void main(String[] args) {
		//dmbCellPhone에 대한 객체 생성
		ch7_01_dmbCellPhone c1 = new ch7_01_dmbCellPhone("자바폰", "검정", 10);

		//생성한 객체의 model, color, channel 값을 각각 출력
		//model, color 필드는 부모의 필드지만 상속을 받았기 떄문에
		//자식 클래스에서 접근이 가능함.
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.channel);
		
		//부모 클래스에서 선언한 메소드 각각 호출
		c1.PowerOn();
		c1.PowerOff();
		c1.bell();
		c1.sendVoice("ㅇㅇㅇ");
		c1.receiveVoice("ㄹㄹㄹㄹㄹ");
		c1.hangUp();
		
		//자식 클래스에서 선언한 메소드 각각 호출
		c1.turnOnDmb();
		c1.changeChannelDmb(5);
		c1.turnOffDmb();
	}

}
