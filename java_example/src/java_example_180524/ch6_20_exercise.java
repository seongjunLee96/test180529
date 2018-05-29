package java_example_180524;

public class ch6_20_exercise {
	private String ownerName;	//예금주
	private int accountNumber;	//계좌번호
	private int balance;		//잔고

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	/*public int deposit(int deposit) {
		balance += deposit; 
		return balance;
	}
	
	public int withdraw(int withdraw) {
		if(balance >= withdraw)
			balance -= withdraw;
		return balance;
	}*/
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	
	public void result() {
		System.out.println("예금주 이름 : " + getOwnerName());
		System.out.println("계좌번호 : " + getAccountNumber());
		System.out.println("잔고 : " + getBalance());
	}
	
	
}
