package pkg04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("����1 �Է�");
//		int su1 = scan.nextInt();
//		
//		System.out.println("����2 �Է�");
//		int su2 = scan.nextInt();
//		
//		System.out.println("�Էµ� ���� : " + (su1 + su2));
		
		
		int total = 0; // ����
		int count = 0; // ȸ��
		double average = 0; // ���
		
		while(true) {
			System.out.println("���� ������ �� : " + total);
			System.out.println("���� ���� �Է� : ");
			int su = scan.nextInt();
			
			if(su < 0) {
				System.out.println("������ �Է��� �� �����ϴ�.");
				break;
			}
			
			total += su;
			count++;
		}
		
		average = (double)total / count;
		
		System.out.println("�� ���� Ƚ�� : " + count);
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
	}
}
