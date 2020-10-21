package pkg19;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// DecimalFormat : 10���� ������ �����ִ� ��ƿ��Ƽ Ŭ����
		// # : ���� 1���� �ǹ�, �ڸ����� ������ #�� ���� �˴ϴ�.
		// 0 : ���� 1���� �ǹ�, �ڸ����� ���Ƶ� 0�� ���ŵ��� �ʽ��ϴ�.
		// , : �޸��� �ǹ�
		// . : �Ҽ����� �ǹ�
		// % : ������� �ǹ�
		
		
		
		// 1,234.57
		double su = 1234.56789;
		
		String pattern = "###,###.00";
		DecimalFormat df1 = new DecimalFormat(pattern);
		String result = df1.format(su);
		System.out.println("��� 01 [" + result + "]");
		
		// 001,234.57
		pattern = "000,000.00";
		DecimalFormat df2 = new DecimalFormat(pattern);
		result = df2.format(su);
		System.out.println("��� 02 [" + result + "]");
		
		// 001234
		int su1 = 1234;
		pattern = "000000";
		DecimalFormat df3 = new DecimalFormat(pattern);
		result = df3.format(su1);
		System.out.println("��� 03 [" + result + "]");
		
		// 25.73%
		su = 0.257345;
		pattern = "###.00%";
		DecimalFormat df4 = new DecimalFormat(pattern);
		result = df4.format(su);
		System.out.println("��� 03 [" + result + "]");
		
		
	}

}
