package java_example_180530;

public class ch7_16_carExample {

	public static void main(String[] args) {
		ch7_16_sedan sedan = new ch7_16_sedan(299, "흰색");
		ch7_16_truck truck = new ch7_16_truck(199, "검정색");
	
		System.out.print(sedan.color + sedan.speed);
		 sedan.load();
		System.out.print(truck.color + truck.speed);
		 truck.load();
	}

}
