package java_example_180601;

import java.util.*;

//MAP예제
public class ch15_04_mapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("학생1", 100);
		map.put("학생2", 90);
		map.put("학생3", 60);
		map.put("학생4", 80);
		map.put("학생5", 30);
		
		System.out.println("Map에 저장된 데이터 수 : " + map.size());
		
		//특정 데이터 찾기
		System.out.println(map.get("학생1"));	//인덱스 번호 없으니 키값을 써준다
		
		Set<String> keyset = map.keySet();	//키값만 뽑아서 keyset으로 대입
		Iterator<String> keyIterator = keyset.iterator();	//keyIterator에 대입
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();	//string타입의 key에 대입
			Integer value = map.get(key);	//하나씩 꺼내진 키값들이 들어가서 키값에 해당하는 벨류값을 집어넣어서
			System.out.println(key + " : " + value);
		}
	
	}

}
