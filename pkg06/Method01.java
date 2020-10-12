package pkg06;

public class Method01 { 
	// 정수 2개를 매개 변수로 입력 받는 메소드 calc를 정의 합니다.
	// 이 메소드는 반환 타입이 정수형 입니다.
	
	static int calc(int a, int b){ // a, b를 형식 매개 변수(사본)
		int result = 2 * a + 3 * b - 3;
		return result;
	}

	public static void main(String[] args) {
		// y = 2 * x1 * 3 * x2 - 3
		// x1 = 3, x2 = 2, y = 6 + 6 - 3 = 9
		// x1 = 2, x2 = 5, y = 4 + 15 - 13 = 16
		
		int x1 = 3;
		int x2 = 2;
		int y = calc(x1, x2); // 호출하는 쪽의 x1, x2 실 매개 변수(원본)
		
		System.out.println("y1 = " + y);
		
		
		x1 = 2;
		x2 = 5;
		y = calc(x1, x2);
		
		System.out.println("y2 = " + y);
		
	}

}
