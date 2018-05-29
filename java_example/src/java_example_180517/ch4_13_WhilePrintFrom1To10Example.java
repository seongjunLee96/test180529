package java_example_180517;

import java.util.Scanner;

public class ch4_13_WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		/*int i = 1, sum = 0;
		while(i<=100) {
			//while문의 조건식을 만족하는 동안 실행
//			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println(sum);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("메시지를 입력하세요\n프로그램을 종료하려면 q를 입력하세요.");
		String text;
		do {
			System.out.print(">");
			text = scanner.next();
			System.out.println(text);
		}while(! text.equals("q"));
	}

}
