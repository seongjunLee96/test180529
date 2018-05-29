package java_example_180518;

import java.util.Scanner;

public class ch4_22_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int deposit = 0;	//예금
		int withdraw = 0;	//출금
		int balance = 0;	//잔고
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt(); //선택
			switch(select) {
			case 1:{	//예금
				System.out.print("예금> ");
				deposit = scanner.nextInt(); 
				balance += deposit;
				System.out.println("현재잔액은 " + balance + "원입니다.");
				break;
			}
			case 2:{	//출금
				System.out.print("출금> ");
				withdraw = scanner.nextInt();
				if(balance >= withdraw) {
					balance -= withdraw;
					System.out.println("현재잔액은 " + balance + "원입니다.");
					}
				else 
					System.out.println("잔고가 부족합니다.\n 현재잔액은 " + balance + "원입니다.");
				break;
			}
			case 3:{
				System.out.print("잔고> ");
				System.out.println("현재잔액은 " + balance + "원입니다.");
				break;
			}
			}
			if(select == 4 )	//종료
				break;
		}
	}
}
