package java_example_180518;

import java.util.Scanner;

public class ch4_21_Example {

	public static void main(String[] args) {
		int count = 0;
		int random = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			int input = scanner.nextInt();
			count++;
			if(random > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if(random < input)
				System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞췄습니다.\n" + "시도횟수는 " + count + "번입니다.");
				break;
				}
		}
	}
}