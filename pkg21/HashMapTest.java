package pkg21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<String, String>();
		
		maps.put("name", new String("ȫ�浿"));
		maps.put("addresss", "����");
		maps.put("phone", "0101112222");
		maps.put("password", "1234");
		
		// id��� Ű�� �ִ��� �˻��ϰ� ���ٸ� hong�̶�� ������ �����͸� �Է��ϼ���.
		
		if (!maps.containsKey("id")) {
			maps.put("id", "hong");
		}
		
		System.out.println("��� ��� ����Ʈ �ϱ�");
		
		Set<String> keys = maps.keySet();
		
		for (String key : keys) {
			String value = maps.get(key);
			String imsi = key + " / " + value;
			System.out.println(imsi);
		}

	}

}
