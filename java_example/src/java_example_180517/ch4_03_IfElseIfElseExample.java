package java_example_180517;

import java.util.Scanner;

//if, else if, else if,..., else
public class ch4_03_IfElseIfElseExample {

	public static void main(String[] args) {
		/*
		 * 점수를 스캔으로 입력받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~90입니다. 등급은 B입니다
		 * 70이상 80미만이면 점수가 70~80입니다. 등급은 C입니다.
		 * 60이상 70미만이면 점수가 60~70입니다. 등급은 D입니다.
 		 * 60미만이면 점수가 60미만입니다. 재수강 고고 FFFFFFFFFFF.

		 */
		System.out.println("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		if(score>=90) 
			System.out.println("점수가 90~100입니다.\n 등급은 A입니다");
		else if(score>=80)
			System.out.println("점수가 80~90입니다.\n 등급은 B입니다");
		else if(score>=70)
			System.out.println("점수가 70~80입니다.\n 등급은 C입니다");
		else if(score>=60)
			System.out.println("점수가 60~70입니다.\n 등급은 D입니다");
		else
			System.out.println("재수강 고고 FFFFFFFFFFF");
		
	}

}
