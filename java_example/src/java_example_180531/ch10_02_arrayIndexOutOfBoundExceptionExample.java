package java_example_180531;

public class ch10_02_arrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		try {
		int A[] = {0, 0};
		for(int i = 0 ; i < 4 ; i++)
			System.out.println(A[i]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했으니 코드를 확인해 볼 것");
		}finally {
			System.out.println("finally는 무조건 실행됩니다.");
		}
	}

}
