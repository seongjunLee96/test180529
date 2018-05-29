package java_example_180517;
//switch~case 문 연습
public class ch4_06_SwitchExample {

	public static void main(String[] args) {
		//1~6사이의 난수 발생
		int num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1: //num == 1인 경우
			System.out.println("1번이 나왔습니다.");
			break;
		case 2: //num == 1인 경우
			System.out.println("2번이 나왔습니다.");
			break;
		case 3: //num == 1인 경우
			System.out.println("3번이 나왔습니다.");
			break;
		case 4: //num == 1인 경우
			System.out.println("4번이 나왔습니다.");
			break;
		case 5: //num == 1인 경우
			System.out.println("5번이 나왔습니다.");
			break;
		default :
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
