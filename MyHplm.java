package pkg18;
import java.util.Scanner;

public class MyHplm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("���ڿ� �Է� : "); // 1H2P3L4M
			String str = scan.next();
			String result = HPML(str);
			
			System.out.println(result);
		}

	}

	private static String HPML(String str) {
		char[] ch = new char[str.length()];
		
		double imsi = 0.0;
		String result = ""; // ��� ���ڿ��� ������ ���� (1��2Ǭ3��)
		double su = 0.0; // �Ҽ��� ����� ������ ���� (0.123)
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			
			if (i % 2 == 0) {
				imsi = Double.parseDouble(String.valueOf(ch[i]));
				System.out.println(imsi);
			} else {
				switch (ch[i]) {
				case 'H':
					su += (imsi * 0.1);
					result += (int)imsi + "�� ";
					break;
				case 'P':
					su += (imsi * 0.01);
					result += (int)imsi + "Ǭ ";
					break;
				case 'L':
					su += (imsi * 0.001);
					result += (int)imsi + "�� ";
					break;
				case 'M':	
					su += (imsi * 0.0001);
					result += (int)imsi + "�� ";
					break;
				}
			}
		}
		System.out.println("���� ��� : " + su);
		System.out.println("���ڿ� ��� : " + result);
		String ret = str + "�� " + result + "�̰�, ���� " + su + "�Դϴ�.";
		return ret;
	}

}