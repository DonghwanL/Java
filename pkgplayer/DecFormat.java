package pkgplayer;

import java.text.DecimalFormat;

public class DecFormat {

	public static void main(String[] args) {
		String pattern = "00"; // �ڸ����� �ǹ�
		DecimalFormat df = new DecimalFormat(pattern);
		
		double su = 12.3456789;
		String result = df.format(su);
		System.out.println(result);
		
		int su2 = 3;
		result = df.format(su2) + "��";
		System.out.println(result);
	}

}
