package pkg06;

public class Method03 {
	
	static int max(int a, int b, int c) {
		int result = 0;
		result = a > b ? a : b;
		result = result > c ? result : c;
	
		return result;
	}
	
	static int min(int a, int b, int c) {
		int result = 0;
		result = Math.min(a, b);
		result = Math.min(result, c);
		
		return result;
	}

	public static void main(String[] args) {
		// 다음 3개의 정수 중에서 가장 큰 수를 반환해주는 메소드 max 구현하기
		// 다음 3개의 정수 중에서 가장 큰 수를 반환해주는 메소드 min 구현하기
		
		int x = 3, y = 8, z = 4;
		
		int result = max(x, y, z);
		System.out.println("최대값 : " + result);
		
		result = min(x, y, z);
		System.out.println("최소값 : " + result);
		
	}

}
