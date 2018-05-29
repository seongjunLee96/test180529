package java_example_180525;

public class ch6_24_account {
	//필드 선언
	private int balance;
	//상수 선언
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE)
		this.balance = balance;
		else
			return;
	}
	
}
