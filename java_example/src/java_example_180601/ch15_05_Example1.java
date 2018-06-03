package java_example_180601;

import java.util.*;

public class ch15_05_Example1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		//리스트에 5명의 사람이름 입력하기
		for(int i = 0 ; i <= 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			list.add(name);
		}

		//입력된 사람들의 이름 출력하기
		for(String name: list) {
			System.out.println(name);
		}

		//입력된 이름 중 가장 긴 이름 출력하기 
		int longname = 0;
		for(int i = 1 ; i < list.size() ; i++) {
			if(list.get(longname).length() < list.get(i).length()) {
				longname = i;
			}
		
		}
		System.out.println("가장 긴 이름은 " + list.get(longname));
	}

}
