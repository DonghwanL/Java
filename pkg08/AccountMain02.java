package pkg08;

public class AccountMain02 {

	public static void main(String[] args) {
		
		System.out.println(Account02.bankname);
		
		
		// 2. 객체 생성
		Account02 soo;
		soo = new Account02();
		
		Account02 hee = new Account02();
		
		// 3. 멤버 변수의 값 설정/지정
		// 철수가 static 변수의 값을 변경
		soo.bankname = "KB"; 
		soo.name = "김철수";
		soo.no = 1234;
		soo.deposit = 1000;
		
		hee.bankname = "KB";
		hee.name = "박영희";
		hee.no = 5678;
		hee.deposit = 2000;
		
		// 영희가 출력하니 철수가 바꾼 값이 보임
		System.out.println(hee.bankname);
		
		soo.Display();
		System.out.println();
		
		hee.Display();
		
		// 4. 데이터 표현 및 연산에 사용하기
//		System.out.println(soo.name + "님의 통장 정보");
//		System.out.println("거래처 : " + soo.bankname);
//		System.out.println("예금주 : " + soo.name);
//		System.out.println("계좌번호 : " + soo.no);
//		System.out.println("예치금 : " + soo.deposit);
//		System.out.println();
//		
//		System.out.println(hee.name + "님의 통장 정보");
//		System.out.println("거래처 : " + hee.bankname);
//		System.out.println("예금주 : " + hee.name);
//		System.out.println("계좌번호 : " + hee.no);
//		System.out.println("예치금 : " + hee.deposit);
		
		
	}

}
