package java_example_180528;
//calculator 클래스의 자식클래스
public class ch7_03_computer extends ch7_03_calcualator {
	
	/*부모클래스에서 선언한 areaCircle 메소드를 재정의함
	 * 굳이 @override를 쓰지 않아도 알아서 메소드 재정의가 된 것으로 인지하지만
	 * 컴파일러에게 정확한 지시를 위해 사용
	*/
	@Override
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
