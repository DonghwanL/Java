package pkg18;
import java.util.Scanner;

public class MyHplm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("문자열 입력 : "); // 1H2P3L4M
			String str = scan.next();
			String result = HPML(str);
			
			System.out.println(result);
		}

	}

	private static String HPML(String str) {
		char[] ch = new char[str.length()];
		
		double imsi = 0.0;
		String result = ""; // 결과 문자열을 저장할 변수 (1할2푼3리)
		double su = 0.0; // 소수점 결과를 저장할 변수 (0.123)
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			
			if (i % 2 == 0) {
				imsi = Double.parseDouble(String.valueOf(ch[i]));
				System.out.println(imsi);
			} else {
				switch (ch[i]) {
				case 'H':
					su += (imsi * 0.1);
					result += (int)imsi + "할 ";
					break;
				case 'P':
					su += (imsi * 0.01);
					result += (int)imsi + "푼 ";
					break;
				case 'L':
					su += (imsi * 0.001);
					result += (int)imsi + "리 ";
					break;
				case 'M':	
					su += (imsi * 0.0001);
					result += (int)imsi + "모 ";
					break;
				}
			}
		}
		System.out.println("숫자 결과 : " + su);
		System.out.println("문자열 결과 : " + result);
		String ret = str + "은 " + result + "이고, 숫자 " + su + "입니다.";
		return ret;
	}

}
