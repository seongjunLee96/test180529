package java_example_180601;

import java.util.*;

public class ch15_02_vectorExample {

	public static void main(String[] args) {
		List<ch15_02_board> list = new Vector<ch15_02_board>();
		
		list.add(new ch15_02_board("제목1", "글내용", "사용자1")); 
		list.add(new ch15_02_board("제목2", "글내용", "사용자2"));
		list.add(new ch15_02_board("제목3", "글내용", "사용자3"));
		list.add(new ch15_02_board("제목4", "글내용", "사용자4"));
		list.add(new ch15_02_board("제목5", "글내용", "사용자5"));
		
		for(int i = 0 ; i < list.size() ; i++) {
			ch15_02_board board = list.get(i);
			System.out.print(board.subject + "\t");
			System.out.print(board.content + "\t");
			System.out.println(board.writer);
		}
			
	}

}
