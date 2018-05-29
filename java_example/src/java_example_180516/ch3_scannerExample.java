package java_example_180516;

import java.util.Scanner;
/*
 * next() : 문자열 입력
 * netxInt() : 정수 입력
 * nextDouble() : 실수 입력
 * close() : 스캐너 종료
 */
public class ch3_scannerExample {

	public static void main(String[] args) {
		//스캐너를 사용하기 위한 스캐너 객체 생성
		/*Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("당신의 이름을 입력해주세요 : ");
		name = scanner.next();//.next() 문자열 입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은 " + name + "입니다.");
		scanner.close();*/
		/*Scanner scanner = new Scanner(System.in);
		String name, city, age, weight;
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");
		name = scanner.next();
		city = scanner.next();
		age = scanner.next();
		weight = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		System.out.println("당신의 나이는 " + age + "살입니다.");
		System.out.println("당신의 체중은 " + weight + "kg입니다.");*/
		/*double radius, area;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요 : ");
		radius = scanner.nextDouble();
		area = 3.141592 * radius * radius;
		System.out.println("원의 면적은 " + area + "입니다");*/
		int input_second, hour, minute, second;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요 : ");
		input_second = scanner.nextInt();
		hour = input_second / 3600;
		minute = input_second % 3600 / 60;
		second = input_second % 3600 % 60;
		System.out.println(input_second + "초는 " + hour + "시간 " + minute + "분 " + second +"초입니다.");
		
		
		
	}

}
