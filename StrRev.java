package pkg18;
public class StrRev {

	public static void main(String[] args) {
		String str = "Korea";
		String upper = str.toUpperCase(); // 대문자 변경
		
		// 반복문 사용하기
		String imsi = "";
		for (int i = upper.length()-1; i >= 0; i--) {
			imsi += upper.charAt(i);
		}
		
		System.out.println("결과 01 : " + imsi);
		
		// StringBuffer 클래스 사용하기
		StringBuffer sb = new StringBuffer(upper);
		System.out.println("결과 02 : " + sb.reverse());
		
		// AeRoK
		imsi = "";
		for (int i = upper.length()-1; i >= 0; i--) {
			if (i % 2 == 0) {
				imsi += upper.charAt(i);
			} else {
				imsi += String.valueOf(str.charAt(i)).toLowerCase();
			}
		}
		System.out.println("결과 03 : " + imsi);

	}

}
