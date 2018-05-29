package java_example_180521;

import java.util.Scanner;

public class ch5_17_Exercise09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int student = 0;		//학생 수
		int scores [] = null;	//배열 크기
		int score = 0;	//학생 점수
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석| 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt();	//선택
			switch(select) {
				case 1:{	//학생 수
					System.out.print("학생수> ");
					student = scanner.nextInt(); 
					scores = new int [student];
					break;
				}
				case 2:{	//점수 입력
					for(i = 0 ; i < scores.length ; i++) {
						System.out.print((i+1) + "번 째 학생 점수 : ");
						score = scanner.nextInt();
						scores[i] = score;
					}
					break;
				}
				case 3:{	//점수리스트
					for(i = 0 ; i < scores.length ; i++)
						System.out.println((i+1) + "번 째 학생 점수 : " + scores[i]);
					break;
				}
				case 4:{	//점수분석
					int max = 0;
					float avg = 0f;
					for(i = 0 ; i < scores.length ; i++) {
						avg += scores[i];
						if(scores[i]>max)
							max = scores[i];
					}
					avg /= scores.length;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
					break;
				}
			}
			if(select == 5 )	//종료
				break;
		}
	}
}
