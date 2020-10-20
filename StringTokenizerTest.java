package pkg18;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "�ҳ�ô� ��� �����ɽ� exid �ɽ�����";
		
		StringTokenizer st1 = new StringTokenizer(str);
		System.out.println("��ū ���� : " + st1.countTokens());
		
		while(st1.hasMoreTokens()) {
			String item = st1.nextToken();
			System.out.println(item);
		}
		System.out.println();
		
		str = "�ҳ�ô�/���/�����ɽ�/exid/�ɽ�����";
		String delim = "/";
		StringTokenizer st2 = new StringTokenizer(str, delim);
		
		System.out.println("��ū ���� : " + st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			String item = st2.nextToken();
			System.out.println(item);
		}
		System.out.println();
		
		str = "�ҳ�ô�/���/�����ɽ�/exid/�ɽ�����";
		delim = "/";
		StringTokenizer st3 = new StringTokenizer(str, delim, true);
		System.out.println("��ū ���� : " + st3.countTokens());
		
		while(st3.hasMoreTokens()) {
			String item = st3.nextToken();
			System.out.println(item);
		}
		System.out.println("===================================");
		
		String str2 = "id=hong&password=1234&address=������";
		
		delim = "&";
		StringTokenizer st4 = new StringTokenizer(str2, delim);
		
		int cnt_token = st4.countTokens();
		System.out.println("��ū ���� : " + cnt_token);
		
		delim = "=";
		for (int i = 0; i < cnt_token; i++) {
			String item = st4.nextToken();
			StringTokenizer st5 = new StringTokenizer(item, delim);	
			while(st5.hasMoreTokens()) {
				String imsi = st5.nextToken();
				System.out.print(imsi + "\t");
			}
			System.out.println();
		}
		
		
		
		

	}

}
