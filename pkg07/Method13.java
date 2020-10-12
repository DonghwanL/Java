package pkg07;

public class Method13 {

	public static void main(String[] args) {
		// jegob(3, 6) = 3*3 + 6*6 = 45
		// max(3, 6) = 큰 수 6
		// sub(수1, 수2) = 수1 - 수2
		// square(x) = x * x
		
		int x = 3, y = 6;
		
		int res1 = jegob(x, y);
		int res2 = max(x, y);
		System.out.println(res1);
		System.out.println(res2);
		sub(res1, res2);
	}
	
	static int square(int x) {
		return x * x;
	}
	
	static int jegob(int x, int y) {
		return square(x) + square(y);
	}
	
	static int max(int x, int y) {
		return x > y ? x : y;
	}
	
	static void sub(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}

}
