package java_example_180525;

import java.util.Scanner;

public class ch6_25_bankApplication {
	//ch6_25_account클래스 타입의 크기 100짜리의 accountArray라는 배열 변수 선언
	private static ch6_25_account[] accountArray = new ch6_25_account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
				case 1:{
					createAccount();
					break;
				}
				
				case 2:{
					accountList();
					break;
				}
				case 3:{
					deposit();
					break;
				}
				case 4:{
					withdraw();
					break;
				}
			}
			
			if(selectNo == 5) {
			System.out.println("프로그램 종료");
			break;
			
			}
		}
	}

		//계좌 생성하기 (CreateAccount 메소드)
		private static void createAccount() {
			
			System.out.println("--------");
			System.out.println("계좌생성");
			System.out.println("--------");
			System.out.print("계좌 번호 : ");	
			String ano = scanner.next();
			System.out.print("계좌주 : ");
			String owner = scanner.next();
			System.out.print("초기입금액 : ");
			int balance = scanner.nextInt();

			//입력받은 값을 이용하여  Account 클래스에 대한 객체 생성
			ch6_25_account Account = new ch6_25_account(ano,owner,balance);
			//입력 받은 값을 배열 변수에 하나씩 저장
			for(int i = 0 ; i < accountArray.length ; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = Account;
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		
		//계좌목록보기  (accountList 메소드)
		private static void accountList() {
			System.out.println("--------");
			System.out.println("계좌목록");
			System.out.println("--------");
			for(int i = 0 ; i < accountArray.length ; i++) {
				//account 클래스 타입의 Account 변수를 선언함.
				//accountArray 배열에 있는 내용을 담는다.
				ch6_25_account Account = accountArray[i];
				if(Account != null) {
					System.out.print(Account.getAno() + "\t");
					System.out.print(Account.getOwner() + "\t");
					System.out.println(Account.getBalance());
					
				}
				/*if(accountArray[i] != null) {
					System.out.print(accountArray[i].getAno() + "\t");
					System.out.print(accountArray[i].getOwner() + "\t");
					System.out.println(accountArray[i].getBalance());
				}*/
			}
		}
		
		//예금하기  (deposit 메소드)
		private static void deposit() {
			System.out.println("--------");
			System.out.println("예금");
			System.out.println("--------");
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			System.out.print("입금액 : ");
			int money = scanner.nextInt();
			//ch6_25_account 클래스 타입의  Account 변수를 선언
			//우변의 내용 : findAccount 메소를 호출하면서 매개변수는 ano로 넘김
			ch6_25_account Account = findAccount(ano);
			if(Account == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			int balance = Account.getBalance() + money;
			Account.setBalance(balance);
			System.out.println("예금이 성공되었습니다.");
			System.out.println("잔액은 " + Account.getBalance() + "원 입니다.");
		}
		
		//출금하기
		private static void withdraw() {
			System.out.println("--------");
			System.out.println("출금");
			System.out.println("--------");
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			System.out.print("출금액 : ");
			int money = scanner.nextInt();
			ch6_25_account Account = findAccount(ano);
			if(Account == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			int balance = Account.getBalance() - money;
			Account.setBalance(balance);
			System.out.println("출금이 성공되었습니다.");
			System.out.println("잔액은 " + Account.getBalance() + "원 입니다.");
		}
	
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		//매개변수 ano
		//리턴타입 : ch6_25_account 클래스
		private static ch6_25_account findAccount(String ano) {
			ch6_25_account Account = null;
			//ano와 일치하는 계좌번호를 찾기 위해 배열의 모든 내용을 반목문을 통해 검색
			for(int i = 0 ; i < accountArray.length ; i++) {
				if(accountArray[i] != null) {
					//배열에 저장되어 있는 계좌번호를 임시로 저장하기 위한 변수
					String dbAno = accountArray[i].getAno();
					//검색된 계좌번호와 매개값으로 받은 ano가 일치하는지 판단
					if(dbAno.equals(ano)) {
						//일치하면 해당 인덱스에 있는 내용을 account 변수에 저장
						Account = accountArray[i];
						break;
					}
				}
			}
			return Account;
		}
}