package pkg06;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 요소가 5개인 배열을 정의하세요.
		// 스캐너를 이용하여 값들을 입력 받습니다.
		// 요소들의 홀수의 총합과 짝수의 총합을 출력하는 프로그램 
		// 입력된 수 (5, 4, 6, 6, 7) 홀수의 합 : 12, 짝수의 합 : 16
		
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];
		int odd = 0, even = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();
			
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}
		
		System.out.println("홀수의 총합 : " + odd);
		System.out.println("짝수의 총합 : " + even);

	}

}
