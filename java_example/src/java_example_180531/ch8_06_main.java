package java_example_180531;


public class ch8_06_main {

	public static void main(String[] args) {
		/*ch8_06_countable[] m = {new ch8_06_bird("뻐꾸기"), new ch8_06_bird("독수리"),
		new ch8_06_tree("사과나무"), new ch8_06_tree("밤나무")};*/
		ch8_06_countable[] m = {new ch8_06_bird("뻐꾸기",5), new ch8_06_bird("독수리",2),
				new ch8_06_tree("사과나무",5), new ch8_06_tree("밤나무",3)};
		for(ch8_06_countable e: m)
			/*
			 * 첫번째 반복문 
			 * e=m[0]
			 *  =new ch8_06_bird("뻐꾸기")
			 * 뻐꾸기를 매개변수로 하는 ch8_06_bird객체를 생성해서 e에 대입
			 * 
			 * 두번쨰 반복문
			 * e=m[1]
			 *  =new ch8_06_bird("독수리")
			 *  독수리를 매개변수로 하는 ch8_06_bird의 객체를 생성해서 e에 대입
			 */
			e.count();//뻐꾸기가 2 마리 있다.
		for(int i = 0 ; i < m.length ; i++) {
			//타입에 따라 fly()또는 ripe()메소드를 호출

			//조건문을 이용해서 배열에 저장된 각 요소가 ch8_06_bird클래스 타입인지 확인
			if(m[i] instanceof ch8_06_bird)
				((ch8_06_bird)m[i]).fly();	//ch8_06_bird 클래스 타입으로 강제 형변환해서 fly()호출
			else
				((ch8_06_tree)m[i]).ripen();	//ch8_06_tree 클래스 타입으로 강제 형변환해서 ripen()호출
				
		}
	}
}