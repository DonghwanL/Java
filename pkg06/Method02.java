package pkg06;

public class Method02 {
	static int add(int m, int n) {
		// 메소드 작성(선언)
		int result = m + n;
		return result;
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		int result = add(x, y); // 메소드 호출
		
		System.out.println("결과 01 : " + result);
		System.out.println("결과 02 : " + add(10, 20));
		
		for (int i = 1; i <= 3; i++) {
			result = add(x, i);
			System.out.println("결과 : " + result);
		}
		
	}

}
