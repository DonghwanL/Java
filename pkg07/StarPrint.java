package pkg07;

import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		// ��ĳ�� Ŭ������ �̿��Ͽ� ���� 1���� �Է� �޽��ϴ�.
		// ���� ������ ������ ���� ������ ���� �մϴ�. (Math.abs) 
		// ���� 0�� �ԷµǸ� �� 5���� ����ϵ��� �մϴ�
		// �ش� ����ŭ ���� ������ִ� �޼ҵ� ShowStar�� �����ϼ���.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
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
