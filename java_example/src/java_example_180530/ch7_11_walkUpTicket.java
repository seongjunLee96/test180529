package java_example_180530;

public class ch7_11_walkUpTicket extends ch7_11_ticket{
	

	//필드
	private boolean payByCredit;
	
	//생성자
	public ch7_11_walkUpTicket(int number, boolean payByCredit) {
		super(ticketNum);
		this.payByCredit =payByCredit;
	}
	
	//메소드
	void process() {
		if(creaditCard == true)
			price *= 1.05;
		System.out.println(price);
	}
	
	
}
