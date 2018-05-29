package java_example_180521;

import java.util.Scanner;

public class ch5_11_arrayExercise {

	public static void main(String[] args) {
		/*
		 * 거스름돈 문제
		 * 어떤 금액을 입력하게 되면 각 동전이 몇 개씩 필요한지 출력 하는 문제
		 * 가능한 적은 수의 동전으로 거슬러 줄 수 있도록
		 * 예를 들어
		 * 2680원이면
		 * 500원 : 5개
		 * 100원 : 1개
		 * 50원 : 1개
		 * 10원 : 3개
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = scanner.nextInt();
		int count = 0;
		int won = 500;
		int sw = 1;
		do{
			if(sw == 1) {
				count = money / won;	//몫 개수
				System.out.println(won + "원 : " + count +"개");
				money %= won;	// 나머지 돈
				sw *= -1;
				won /= 5;
				}
			else {
				count = money / won;	//몫 개수
				System.out.println(won + "원 : " + count +"개");
				money %= won;	//나머지 돈
				sw *= -1;
				won /= 2;
				}
		}while(won >= 10);
	}
}
