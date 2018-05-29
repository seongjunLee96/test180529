package java_example_180525;

public class ch6_25_account {
	
	//필드 선언
	private String ano;		//계좌번호 필드
	private String owner;	//계좌주 필드
	private int balance;	//초기 입금액 필드

	//생성자 선언
	public ch6_25_account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//getter, setter 메소드
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}
