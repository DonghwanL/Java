package pkg21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<String, String>();
		
		maps.put("name", new String("홍길동"));
		maps.put("addresss", "신촌");
		maps.put("phone", "0101112222");
		maps.put("password", "1234");
		
		// id라는 키가 있는지 검사하고 없다면 hong이라는 값으로 데이터를 입력하세요.
		
		if (!maps.containsKey("id")) {
			maps.put("id", "hong");
		}
		
		System.out.println("모든 요소 프린트 하기");
		
		Set<String> keys = maps.keySet();
		
		for (String key : keys) {
			String value = maps.get(key);
			String imsi = key + " / " + value;
			System.out.println(imsi);
		}

	}

}
