package pkg06;

public class Method04 {
	
	static int signOf(int x) {
		if (x > 0) {
			return 1;
		} else if(x < 0) {
			return -1;
		} else {	
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// x가 양수이면 1, 음수이면 -1, 0이면 0을 출력해주는 메소드 signOf 구현하기
		System.out.println(Math.signum(1)); // Math 클래스
		
		int x = -12;
		int result = signOf(x);
		
		System.out.println("결과01 : " + result);
		
		x = 0;
		result = signOf(x);
		
		System.out.println("결과02 : " + result);
		
		x = 5;
		result = signOf(x);
		
		System.out.println("결과03 : " + result);
	}

}
