package java_example_180530;

public class ch7_11_ticketExample {

	public static void main(String[] args) {
		//사전예약 티켓 또는 일반 티켓을 각각 객체로 만들어서 정보를 출력
		
		//사전에 예약 객체 생성(티켓번호, 예약일수를 매개변수로)
		ch7_11_AdvancedTicket adTicket = new ch7_11_AdvancedTicket(100,20);
		adTicket.setPrice(10000);
		
		System.out.println("당신의 사전예약 티켓 번호는 " + adTicket.getTicketNumber() + "이고 구매가격은 " + adTicket.getPrice() + "입니다");
	}

}
