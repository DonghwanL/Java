package pkg21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "�Ｚ");
		map.put(2, "�Ե�");
		map.put(3, "SK");
		map.put(4, "���");
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("�ؼ�"));
		
		// 5���� �ؼ��� �ִ��� �ľ��ϰ�, ������ �߰��ϵ��� �ϼ���.
		
		if (!map.containsKey(5)) {
			map.put(5, "�ؼ�");
		} 
		
		System.out.println(map.get(3));
		
		map.remove(4);
		
		System.out.println("���Ҹ� ����ϱ�");
		
		Set<Integer> keylist = map.keySet();
		
		for (Integer key : keylist) {
			String value = map.get(key);
			String imsi = "Ű : " + key + ", �� : " + value;
			System.out.println(imsi);
		}
		
		map.clear();
		
		if (map.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}
		
		System.out.println(map);
		System.out.println("����� ���� : " + map.size());
	}

}
