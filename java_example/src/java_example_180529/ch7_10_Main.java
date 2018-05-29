package java_example_180529;

public class ch7_10_Main {

	public static void main(String[] args) {
		//sedan, truck에 대한 객체 각각 생성
		ch7_10_sedan sedan  = new ch7_10_sedan(100,"빨간색");
		ch7_10_truck truck  = new ch7_10_truck(50,"검정색", 5);
		
		//세단, 트럭의 속도 증가
		sedan.speedUp(100);
		truck.speedUp(50);
		
		sedan.setSeatNum(5);
		
		
		System.out.println(sedan.color+ "승용차의 속도는 " + sedan.speed + "이고  좌석수는 " + sedan.getSeatNum() +"개 입니다");
		System.out.println(truck.color + "트럭의 속도는 " + truck.speed + "이고  적재량은 " + truck.getCapacity() +"개 입니다");
		
	}

}
