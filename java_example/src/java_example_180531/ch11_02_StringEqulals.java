package java_example_180531;

public class ch11_02_StringEqulals {
	public static void main(String[] args) {
		String str1 = new String("이름");
		String str2 = "이름 ";
		
		if(str1 == str2) {
			System.out.println("같은String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if(str1.equals(str2)) {
			System.out.println("같은문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
