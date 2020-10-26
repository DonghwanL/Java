package pkg22;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("id", "hong");
		prop.put("name", "ȫ�浿");
		prop.put("password", "1234");
		prop.put("address", "����");
		prop.put("zipcode", "12345");
		
		System.out.println("������Ƽ ���� : " + prop.size());
		
		String data = prop.getProperty("hphone", "���� ���� ���� �⺻ ��");
		
		if (data == null) {
			System.out.println("�����Ͱ� �����ϴ�.");
		} else {
			System.out.println(data.toString());
		}
		
		// hphone�� ���ٸ� �߰��� ������.
		if (prop.getProperty("hphone") == null) {
			prop.put("hphone", "01024525214");
		}
		
		System.out.println("toString �޼ҵ� : " + prop.toString());
		
		// System.in - Ű���� / System.out - �����
		prop.list(System.out);
		
		System.out.println("������Ƽ�� ����ϱ�");
		
		Enumeration<Object> enu = prop.keys();
		
		while (enu.hasMoreElements()) {
			Object property = enu.nextElement();
			String value = prop.getProperty((String)property);
			System.out.println(property + "/" + value);
		}

		
	}

}
