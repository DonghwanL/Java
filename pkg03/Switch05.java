package pkg03;

public class Switch05 {

	public static void main(String[] args) {
		// switch case 구문 주사위
		// 주사위 눈이 짝수인지 홀수인지 판단
		// 만약 다른 숫자 입력시 error라고 출력
		
		int su = 5;
		
		System.out.println("케이스 01");
		
		switch(su) {
		case 1:
			System.out.println("홀수");
			break;
		case 2:
			System.out.println("짝수");
			break;
		case 3:
			System.out.println("홀수");
			break;
		case 4:
			System.out.println("짝수");
			break;
		case 5:
			System.out.println("홀수");
			break;
		case 6:
			System.out.println("짝수");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		su = 3;
		System.out.println("케이스 02");
		
		switch(su) {
		case 1: 
		case 3: 
		case 5:
			System.out.println("홀수");
			break;
		case 2: 
		case 4: 
		case 6:	
			System.out.println("짝수");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		
		// 계절 출력하기
		// 9월은 "가을" 입니다.
		
		int month = 1;
		String comment = "";
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			comment = "봄";
			break;	
		case 6:
		case 7:
		case 8:
			comment = "여름";
			break;	
		case 9:
		case 10:
		case 11:
			comment = "가을";
			break;	
		case 12:
		case 1:
		case 2:
			comment = "겨울";
			break;	
		}
		
		System.out.println(month + "월은 \"" + comment + "\" 입니다.");
		
		
	}

}
