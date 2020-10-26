package pkg22;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class HumanDao {

	public Hashtable<String, String> List2Table(List<Human> lists) {
		// 리스트 컬렉션을 HashTable로 변경하여 반환해 줍니다.
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		for(Human human : lists) {
			String name = human.getName();
			String value = human.getPassword() + "/" + human.getAge();
			ht.put(name, value);
		}
		
		return ht;
	}

	public void PrintTable(Hashtable<String, String> ht) {
		// HastTable의 목록을 저장 합니다.
		Enumeration<String> enu = ht.keys();
		
		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			
			// 비밀 번호와 나이로 구분되어 있는 상황
			String value = ht.get(name);
			
			String[] arr = value.split("/");
			String password = arr[0];
			int age = Integer.parseInt(arr[1]);
			
			String imsi = "이름 : " + name;
			imsi += ", 비밀번호 : " + password;
			imsi += ", 나이 : " + age;
			System.out.println(imsi);
		}
	}

}
