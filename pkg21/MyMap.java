package pkg21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "삼성");
		map.put(2, "롯데");
		map.put(3, "SK");
		map.put(4, "기아");
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("넥센"));
		
		// 5위인 넥센이 있는지 파악하고, 없으면 추가하도록 하세요.
		
		if (!map.containsKey(5)) {
			map.put(5, "넥센");
		} 
		
		System.out.println(map.get(3));
		
		map.remove(4);
		
		System.out.println("원소를 출력하기");
		
		Set<Integer> keylist = map.keySet();
		
		for (Integer key : keylist) {
			String value = map.get(key);
			String imsi = "키 : " + key + ", 값 : " + value;
			System.out.println(imsi);
		}
		
		map.clear();
		
		if (map.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}
		
		System.out.println(map);
		System.out.println("요소의 개수 : " + map.size());
	}

}
