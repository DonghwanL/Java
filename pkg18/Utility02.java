package pkg18;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Utility02 {

	public static void main(String[] args) {
		String str = "�ҳ�ô� ��� �����ɽ� exid �ɽ�����" ;
		
		StringTokenizer st1 = new StringTokenizer(str);
		System.out.println("��ū ���� : " + st1.countTokens());
		
		String[] st2 = new String[5];
		for (int i = 0; i < st2.length; i++) {
			st2[i] = st1.nextToken();
			System.out.print(st2[i] + "\t");
		}
		System.out.println();
		
		Arrays.sort(st2);
		for (int i = 0; i < st2.length; i++) {
			System.out.print(st2[i] + "\t");
		}

	}

}
