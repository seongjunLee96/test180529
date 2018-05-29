package java_example_180517;
//중첩 for문을 이용한 구구단 출력하기
public class ch4_11_ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i = 1;i<=9;i++) {
			for(int j = 2; j<=9;j++)
				System.out.printf(j + " × " + i + " = " + j * i+ "\t");
		System.out.println("");
		}
	}
}