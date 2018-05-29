package java_example_180525;

import java.util.Scanner;

public class ch6_23_absValue {
	Scanner scan = new Scanner(System.in);
	
	int select;
	
	void select() {
		System.out.println("-----------------");
		System.out.println("수행할 내용을 선택하세요.");
		System.out.println("1. 두점 사이의 거리 구하기");
		System.out.println("2. 절대값 구하기");
		System.out.print("선택 >> ");
		select = scan.nextInt();
	}
	
	void distance() {
		System.out.println("두 점을 (x, y)순으로 입력해주세요.");
		System.out.print("첫번째 x좌표 "); int x1 = scan.nextInt();
		System.out.print("첫번째 y좌표 "); int y1 = scan.nextInt();
		System.out.print("두번째 x좌표 "); int x2 = scan.nextInt();
		System.out.print("두번째 y좌표 "); int y2 = scan.nextInt();
		double distance = 0.0;
		distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("두 점 사이의 거리는 " + distance); System.out.println("입니다.");
	}
	
	void abs() {
		System.out.println("정수를 입력해주세요."); int num = scan.nextInt();
		if (num < 0)
			num *= -1;
		System.out.print("입력하신 정수의 절대값은  " + num); System.out.println("입니다.");
	}
}
