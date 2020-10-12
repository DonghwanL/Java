package pkg08;

public class Account01 {

	public static void main(String[] args) {
		// 통장 개설 프로그램 만들기 (김철수, 박영희)
		// 변수 : 은행 이름(문자열), 예금주(문자열), 계좌번호(숫자), 예치금(숫자)
		// 김철수 : soobank, sooname, soono, sodeposit 
		// 박영희 : heebank, heename, heeno, heedeposit
		
		// 1. 변수 정의 및 값 할당하기
		String soobank; 
		String sooname;
		int soono;
		int soodeposit;
		
		String heebank; 
		String heename;
		int heeno;
		int heedeposit;
		
		soobank = "KB";
		sooname = "김철수";
		soono = 1234;
		soodeposit = 1000;
		
		heebank = "KB";
		heename = "박영희";
		heeno = 5678;
		heedeposit = 2000;
		
		// 2. 해당 변수들을 출력하거나 다른 메소드로 테이터를 넘깁니다.
		
		System.out.println(sooname + "님의 통장 정보");
		System.out.println("거래처 : " + soobank);
		System.out.println("예금주 : " + sooname);
		System.out.println("계좌번호 : " + soono);
		System.out.println("예치금 : " + soodeposit);
		System.out.println();
		
		System.out.println(heename + "님의 통장 정보");
		System.out.println("거래처 : " + heebank);
		System.out.println("예금주 : " + heename);
		System.out.println("계좌번호 : " + heeno);
		System.out.println("예치금 : " + heedeposit);
		
		// 3. 위의 문제를 Class를 이용하여 다시 풀어 보세요.
	}

}
