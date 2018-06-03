package java_example_180601;

import java.util.*;

public class ch15_06_exmple2 {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("considering", "검토");
		dictionary.put("leave", "떠나다");
		dictionary.put("contribute", "기여하다");
		dictionary.put("prevent", "막다");
		dictionary.put("stay", "머무르다");
		dictionary.put("order", "명령하다");
		dictionary.put("held", "열었던");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("단어를 입력하세요 : ");
			String eng = scan.next();
			
			String kor = dictionary.get(eng);
			if(kor == null) {
				System.out.println("사전에 없는 단어 입니다.");
			}else {
				System.out.println("단어의 의미는" + kor + "입니다");
			}
		}
	}

}
