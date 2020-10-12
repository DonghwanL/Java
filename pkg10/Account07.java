package pkg10;

import java.util.Scanner;

public class Account07 {
		private String name;
		private int no = 9999;
		private int balance;
		
		Scanner scan; // 클래스 (기본 값 null)
		
		public Account07() {
			System.out.println("호출");
		}
		
		public Account07(String name, int no, int balance) { //3
			this(); // 매개 변수가 없는 생성자 호출됨
			
			this.scan = new Scanner(System.in); // 생성자 (매개변수)
			
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
			System.out.println("예금주 : " + this.name);
			System.out.println("계좌번호 : " + this.no);
			System.out.println("예치금 : " + this.balance);
			
		}
	}
