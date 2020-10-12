package pkg08;

public class Account02 { // 1. 클래스 정의(선언)
		// static 변수 = 클래스 변수
		static String bankname = "KB";
		
		// 멤버 변수 : 클래스 내에 정의된 변수 (인스턴스 변수)
		String name;
		int no;
		int deposit;
		
		// 멤버 메소드 만들기 (메소드 이름, 매개 변수, 반환 타입)
		void Display() { // 정보를 출력해주는 동작 수행
			System.out.println(name + "님의 통장 정보");
			System.out.println("거래처 : " + bankname);
			System.out.println("예금주 : " + name);
			System.out.println("계좌번호 : " + no);
			System.out.println("예치금 : " + deposit);
		}
	}
