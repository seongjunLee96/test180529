package java_example_180530;

public class ch7_16_truck extends ch7_16_car {

	ch7_16_truck(int speed, String Color) {
		super(speed, Color);
	}
	
	@Override
	public void load() {
		System.out.println("트럭은 짐을 실을 수 있습니다.");
	}
}
