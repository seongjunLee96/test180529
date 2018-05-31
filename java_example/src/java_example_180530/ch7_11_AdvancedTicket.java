package java_example_180530;

public class ch7_11_AdvancedTicket extends ch7_11_ticket{
	//필드
	public int advanceReservationDay;	//사전예약 일수

	//생성자 
	public ch7_11_AdvancedTicket(int number, int advanceReservationDay) {
		super();
		this.advanceReservationDay = advanceReservationDay;
	}
	
	//메소드
	//입장권 가격을 처리
	public double getPrice() {
		if(advanceReservationDay >= 30)
			price *= 0.5;
		else if(advanceReservationDay >= 10)
			price *= 0.8;
		else if(advanceReservationDay >= 5)
			price *= 0.9;
		
		return price;

	}
}
