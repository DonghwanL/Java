package pkg07;

public class Method11 {

	public static void main(String[] args) {
		Add(1, 2); // 정수형 매개 변수 2개
		double result = Add(3.0, 4.0); // 실수형 매개 변수 2개 
		System.out.println(result);
		Add(10, 20); // 정수형 매개 변수 2개
		Add(1, 2, 3); // 정수형 매개 변수 3개
	}
	
	static void Add(int x, int y) {
		System.out.println("a");
		int result = x + y;
		System.out.println(result);
	}
	
	static double Add(double x, double y) {
		System.out.println("b");
		double result = x + y;
		return result;
	}
	
	static void Add(int x, int y, int z) {
		System.out.println("c");
		int result = x + y + z;
		System.out.println(result);
	}

}
