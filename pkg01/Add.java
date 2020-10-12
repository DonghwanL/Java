package pkg01;

public class Add {

	public static void main(String[] args) {
		
		// int x = 3;
		int x, y, z; // 정수를 담을 수 있는 변수 정의 및 선언
		
		// = 기호는 대입 연산자
		x = 3; // 변수 x에 값 (3)을 대입
		y = 5;
		z = x + y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("");
		
		x = 6; // 변수 x에 값 (6)을 대입
		y = 2;
		z = x * y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("");

//		ex) z = 2 * x + 3 * y - 4; (단 x = 1, y = 2)
		
		x = 1;
		y = 2;
		z = 2*x+3*y-4;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		
	}

}
