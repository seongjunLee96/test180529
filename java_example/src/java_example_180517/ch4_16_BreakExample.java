package java_example_180517;

import java.util.Scanner;

public class ch4_16_BreakExample {

	public static void main(String[] args) {
		/*while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			//주사위가 6이 나왔을 때 반복문 종료
			if(num == 6)
				break;
		}
		System.out.println("반복문 종료됨.");*/
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num, count = 0;
		double average = 0.0;
		while(true) {
			num = scanner.nextInt();
			if(num==0)
				break;
			count++;
			average += num;
	}
		average /= count;
		System.out.println("수의 개수는 " + count + "개이며  평균은 " + average + "입니다.");
	}

}
