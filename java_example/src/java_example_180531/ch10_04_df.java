package java_example_180531;

import java.util.Scanner;

public class ch10_04_df {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("분자를  입력 : ");
		int a = scan.nextInt();
		System.out.print("분모를 입력 : ");
		int b = scan.nextInt();
		
		double result;

		result = a / b;
		System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
