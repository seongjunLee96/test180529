package java_example_180530;

public class ch7_16_sedan extends ch7_16_car{

	ch7_16_sedan(int speed, String Color) {
		super(speed, Color);
	}
	
	@Override
	public void load() {
		System.out.println("승용차는 사람을 실을 수 있습니다.");
	}
	
}
