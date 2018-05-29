package java_example_180529;

public class ch7_09_kumhoTire extends ch7_09_tire{

	//필드
	
	//생성자
	public ch7_09_kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		if(++accumulatedRotation < maxRotation) {
			System.out.println(location + "kumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
		
	}
		
}
