package pkg07;

import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		// 스캐너 클래스를 이용하여 정수 1개를 입력 받습니다.
		// 만약 음수가 들어오면 절대 값으로 변경 합니다. (Math.abs) 
		// 숫자 0이 입력되면 별 5개를 출력하도록 합니다
		// 해당 수만큼 별을 출력해주는 메소드 ShowStar를 구현하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력 : ");
		int star = scan.nextInt();
		
		ShowStar(star);
	}

		static void ShowStar(int star) {
			
			if (star == 0) {
				star = 5;
			} else if (star < 0) {
				star = Math.abs(star);
			}
			
			for (int i = 1; i <= star; i++) {
				System.out.print("*");
			}
		
	}
	
	

}
