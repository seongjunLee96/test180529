package java_example_180601;

import java.io.*;

public class fileClass_01 {
	public static void main(String[] args) {
		//기존 파일을 새로운 파일로 저장하기
		//기존파일에 대한 객체 생성
		File rfile = new File("D:\\test\\testfile.txt");
		//새롭게 만들 파일에 대한 객체 생성
		File wfile = new File("D:\\test\\testfile_new.txt");
		
		try {
			//기존 파일을 읽어오기 위한 reader 객 체 생성
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			//읽어온 내용을 쓰기 위한 writer 객체 생성
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			//기존파일에 있는 내용을 읽어서 s에 저장
			while((s=reader.readLine()) != null) {
				writer.write(s + "-새로 쓰여진 파일");
			}
			reader.close();
			writer.close();
			rfile.delete(); //기존파일 삭제
		}catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println("새로 쓰기 완료");
	}
}
