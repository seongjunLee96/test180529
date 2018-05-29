package java_example_180528;

public class ch7_04_SupersonicAirplaneExmaple {

	public static void main(String[] args) {
		ch7_04_supersonicAirplane sa = new ch7_04_supersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = ch7_04_supersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = ch7_04_supersonicAirplane.NORMAL;
		sa.fly();
		sa.land();


	}

}
