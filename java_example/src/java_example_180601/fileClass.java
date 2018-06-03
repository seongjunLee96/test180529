package java_example_180601;

import java.io.*;

public class fileClass {

	public static void main(String[] args) {
		//파일(텍스트파일)을 생성하고 내용을 쓰기
		//저장경로로 사용하기 위한 변수 선언
		String path = "D:\\test\\testfile.txt";
		//파일 객체 생성
		File file = new File(path);
	
		try {
			FileWriter fw = new FileWriter(file);
			for(int i = 'A' ; i <= 'Z' ; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("쓰기완료.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
