package pkg07;

public class Overload02 {

	public static void main(String[] args) {
		overload("±Â¸ð´×", 5);
		System.out.println("===========================");
		overload(10);
		System.out.println("===========================");
		overload('a', 'A', 'f');
		System.out.println("===========================");
		overload(2.0, 3.0);
		System.out.println("===========================");
	}

	static void overload(double x, double y) {
		double result = Math.pow(x, 2) + y * y;
		System.out.println(result);
	}

	static void overload(char x, char y, char z) {
		char result = x > y ? x : y;
		result = result > z ? result : z;
		
		System.out.println(result);
	}

	static void overload(int n) {
	
		int result = 0;
		
		for (int i = 1; i < n; i++) {
			result += i;
		}
		
		System.out.println("ÃÑÇÕ : " + result);

	}

	static void overload(String hello, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(hello);
		}	
		
	}

}
