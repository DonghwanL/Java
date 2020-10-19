package pkg17;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println("int 최대 값 : " + Integer.MAX_VALUE);
		System.out.println("int 데이터 크기 : " + (Integer.SIZE/8) + "바이트"); // 비트
		
		System.out.println("long 최대 값 : " + Long.MAX_VALUE);
		System.out.println("double 최대 값 : " + Double.MAX_VALUE);
		
		int x = 2147483647;
		System.out.println(++x);
		
		int aa = 1234;
		int bb = 5678;
		int cc = 10;
		
		System.out.println("2진수 : " + Integer.toBinaryString(cc));
		
		String imsi = Integer.toOctalString(cc);
		System.out.println("8진수 : " + imsi);
		System.out.println("16진수 : " + Integer.toHexString(cc));
		
		imsi = "";
		String strA = new String("" + aa); // 숫자를 문자열로 변경
		System.out.println(strA);
		
		int len = strA.length();
		System.out.println(len);
		
		for (int i = len-1; i >= 0; i--) {
			imsi += strA.charAt(i);
		}
		
		System.out.println(imsi);
		
		// Wrapper 클래스들은 xxx.valueof() 메소드를 가지고 있음
		String strB = String.valueOf(bb);
		
		String temp = imsi + strB;
		System.out.println("합친 문자열 : " + temp);
		
		int result = Integer.sum(10, 20);
		System.out.println(result);
		
		aa = -10;
		result = Integer.signum(aa);
		System.out.println(result);
		
		// 코드명 + 단가 + 일련 변호
		String str = "ABC123가가";
		
		// 단가에 100 더하기
		String code = str.substring(0, 3); // 0에서부터 3전까지
		String a = str.substring(3, 6);
		int b = Integer.valueOf(a);
		b += 100;
		System.out.println(b);
		
		String sno = str.substring(6); // 6에서 마지막까지
		
		String res = code + String.valueOf(b) + sno;
		System.out.println(res);
			
	}

}
