package pkg22;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("id", "hong");
		prop.put("name", "홍길동");
		prop.put("password", "1234");
		prop.put("address", "신촌");
		prop.put("zipcode", "12345");
		
		System.out.println("프로퍼티 개수 : " + prop.size());
		
		String data = prop.getProperty("hphone", "폰이 없을 때의 기본 값");
		
		if (data == null) {
			System.out.println("데이터가 없습니다.");
		} else {
			System.out.println(data.toString());
		}
		
		// hphone이 없다면 추가해 보세요.
		if (prop.getProperty("hphone") == null) {
			prop.put("hphone", "01024525214");
		}
		
		System.out.println("toString 메소드 : " + prop.toString());
		
		// System.in - 키보드 / System.out - 모니터
		prop.list(System.out);
		
		System.out.println("프로퍼티를 출력하기");
		
		Enumeration<Object> enu = prop.keys();
		
		while (enu.hasMoreElements()) {
			Object property = enu.nextElement();
			String value = prop.getProperty((String)property);
			System.out.println(property + "/" + value);
		}

		
	}

}
