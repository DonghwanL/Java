package pkg19;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// DecimalFormat : 10진수 서식을 도와주는 유틸리티 클래스
		// # : 숫자 1개를 의미, 자리수가 남으면 #은 제거 됩니다.
		// 0 : 숫자 1개를 의미, 자리수가 남아도 0은 제거되지 않습니다.
		// , : 콤마를 의미
		// . : 소수점을 의미
		// % : 백분율을 의미
		
		
		
		// 1,234.57
		double su = 1234.56789;
		
		String pattern = "###,###.00";
		DecimalFormat df1 = new DecimalFormat(pattern);
		String result = df1.format(su);
		System.out.println("결과 01 [" + result + "]");
		
		// 001,234.57
		pattern = "000,000.00";
		DecimalFormat df2 = new DecimalFormat(pattern);
		result = df2.format(su);
		System.out.println("결과 02 [" + result + "]");
		
		// 001234
		int su1 = 1234;
		pattern = "000000";
		DecimalFormat df3 = new DecimalFormat(pattern);
		result = df3.format(su1);
		System.out.println("결과 03 [" + result + "]");
		
		// 25.73%
		su = 0.257345;
		pattern = "###.00%";
		DecimalFormat df4 = new DecimalFormat(pattern);
		result = df4.format(su);
		System.out.println("결과 03 [" + result + "]");
		
		
	}

}
