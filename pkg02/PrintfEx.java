package pkg02;

public class PrintfEx {
	// Main 메소드는 Program Start Point
	// 실행하려면 반드시 존재해야 함.
	public static void main(String[] args) {
		double d = 12.3456789;
		System.out.println("실수 1 : " + d);
		
		System.out.printf("실수 2 : [%6.2f]\n", d);
		System.out.printf("실수 3 : [%.3f]\n", d);
		System.out.printf("실수 4 : [%f]\n", d);
		
		// [ 12.345678]
		System.out.printf("실수 5 : [%11.6f]\n", d);
		
		int i= 65;
		char ch = 'a';
		
		System.out.printf("정수: [%d], 문자 : [%c]\n", i, ch);
		System.out.printf("정수: [%4d], 문자 : [%2c]\n", i, ch);
		System.out.printf("정수: [%-4d], 문자 : [%-2c]\n", i, ch);
		
		
		// 형 변환
		System.out.printf("실수 6 : [%f]\n", (double)i); 
		System.out.printf("정수 : [%d]\n", (int)d); 
		
	}
}
