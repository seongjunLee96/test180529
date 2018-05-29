package java_example_180521;

import java.util.Scanner;

public class ch5_13_arrayExercise {

	public static void main(String[] args) {
		String[][] words = {{"chair", "의자"}, {"desk", "책상"}, {"water", "물"}, {"monitor", "모니터"}, {"mouse", "마우스"}};
		Scanner scanner = new Scanner(System.in);
		int count = 0;
//		words[(int)(Math.random()*words.length)][0]
		for(int i = 0 ; i < words.length ; i++) {
			System.out.print("문제"+ (i+1) +". " + words[i][0] + "의 뜻은 무엇인가요? ");
			String input = scanner.next();
			if(input.equals(words[i][1])) {
				System.out.println("맞았습니다");
				count++;
			}
			else
				System.out.println("틀렸습니다");
				System.out.println("정답은 " + words[i][1] + "입니다.");
		}
		System.out.println("총 " + count + "개를 맞췄습니다.");
		double percent = 100 * ((double)count / words.length);
		System.out.println("정답률은 " + percent + "% 입니다.");
	}

}
