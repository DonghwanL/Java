package pkg04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("정수1 입력");
//		int su1 = scan.nextInt();
//		
//		System.out.println("정수2 입력");
//		int su2 = scan.nextInt();
//		
//		System.out.println("입력된 정수 : " + (su1 + su2));
		
		
		int total = 0; // 총점
		int count = 0; // 회수
		double average = 0; // 평균
		
		while(true) {
			System.out.println("현재 까지의 합 : " + total);
			System.out.println("시험 점수 입력 : ");
			int su = scan.nextInt();
			
			if(su < 0) {
				System.out.println("음수는 입력할 수 없습니다.");
				break;
			}
			
			total += su;
			count++;
		}
		
		average = (double)total / count;
		
		System.out.println("총 시험 횟수 : " + count);
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + average);
		
	}
}
