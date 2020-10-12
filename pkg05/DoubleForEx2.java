package pkg05;

public class DoubleForEx2 {

	public static void main(String[] args) {
		// 문자 A(65), a(97)
		int ch = 65;
		
		System.out.print((char)(ch));
		System.out.println();
		
		System.out.print((char)(ch+1));
		System.out.println();
		
		/*
		 
		 A
		 AB
		 ABC
		 ...
		 ABC...XYZ
		  
		 */
		
		int GAESU = 26;
		int largeA = 65;
		System.out.println("대문자 출력 예시");
		
		for (int i = largeA; i <= (largeA + GAESU -1); i++) {
			for (int j = largeA; j <= i; j++) {
				System.out.print((char)(j));
			}
			System.out.println();
		}
		
		
		/*
		 
		 abc...xyz
		 ...
		 abc
		 ab
		 a
		  
		 */
		
		int smallA = 97;
		int smallZ = 97 + GAESU - 1;
		System.out.println("소문자 출력 예시");
		
		for (int i = smallZ; i >= smallA; i--) {
			for (int j = smallA; j <= i; j++) {
				System.out.print((char)(j));
			}
			System.out.println();
		}
			
		System.out.println();
		
		/* 대소문자가 번갈아 가면서 출력 (양자 택일 구문)
		 
		  A
		  Ab
		  AbC
		  ...
		  
		  AbCd..xYz
		 
		 */
		
		int GAP = 32;
		
		System.out.println();
		
		for (int i = largeA; i < (largeA + GAESU -1) ; i++) {
			for (int j = largeA; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print((char)(j));
				} else {
					System.out.print((char)(j + GAP));
				}
			}
			System.out.println();
		}
	}

}
