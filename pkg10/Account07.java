package pkg10;

import java.util.Scanner;

public class Account07 {
		private String name;
		private int no = 9999;
		private int balance;
		
		Scanner scan; // Ŭ���� (�⺻ �� null)
		
		public Account07() {
			System.out.println("ȣ��");
		}
		
		public Account07(String name, int no, int balance) { //3
			this(); // �Ű� ������ ���� ������ ȣ���
			
			this.scan = new Scanner(System.in); // ������ (�Ű�����)
			
			this.name = name;
			this.no = no;
			this.balance = balance;	
			this.Display();
		}
		
		public Account07(String name, int balance) {
			this.name = name;
			this.balance = balance;
//			this.no = 9999;
		}
		
		public void Display() {
			System.out.println("������ : " + this.name);
			System.out.println("���¹�ȣ : " + this.no);
			System.out.println("��ġ�� : " + this.balance);
			
		}
	}
