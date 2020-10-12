package pkg07;

import java.util.Scanner;

public class Method09 {

	public static void main(String[] args) {
		// 스캐너 클래스를 이용하여 정수 2개(su1, su2)를 입력 받습니다.
		// 메소드 구현 : gugudan(su1)은 해당 su1에 대한 단을 출력하세요. 예) 3*1=3 3*2=6 ...
		// gugudan2(su1, su2)는 su1 단부터, su2단까지 출력하세요. 예) 3*1=3 3*2=6...
		// 5*1=5 5*2=10 ...

		Scanner scan = new Scanner(System.in);
		int su1 = 0, su2 = 0;

		System.out.println("정수 1 입력 : ");
		su1 = scan.nextInt();

		System.out.println("정수 2 입력 : ");
		su2 = scan.nextInt();

		gugudan(su1);
		System.out.println("*****************");
		gugudan2(su1, su2);
	}
	
	static void gugudan2(int su1, int su2) {
		for (int i = su1; i <= su2; i++) {
			for (int j = 1; j < 10; j++) {
				String imsi = "%2d * %2d = %d\t";
				System.out.printf(imsi, i, j, (i*j));
			}
			System.out.println();
		}
	}

	static void gugudan(int su1) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d * %2d = %2d\n", su1, i, (su1*i));
		}
		System.out.println();
	}
	
}
	
