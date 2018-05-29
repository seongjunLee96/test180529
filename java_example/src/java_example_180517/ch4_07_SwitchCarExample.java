package java_example_180517;

import java.util.Scanner;

public class ch4_07_SwitchCarExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학년을 입력하세요 : " );
		int grade = scanner.nextInt();
		System.out.println("점수를 입력하세요 : " );
		int score = scanner.nextInt();
		
		if(grade == 4)
		{
			if(score>=70)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}
		else
		{
			if(score>=60)
				System.out.println("합격");
			else 
				System.out.println("불합격");
		}
		
	}

}
