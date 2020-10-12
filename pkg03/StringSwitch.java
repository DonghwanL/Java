package pkg03;

public class StringSwitch {

	public static void main(String[] args) {
		// 숫자를 이용하여 다음과 같이 출력하는 프로그램을 작성하세요. (switch case 구문)
		// 출력 예시) 2월은 'february'입니다.
		
		int month = 6;
		String monthEng = "";
		
		switch(month) {
		case 1:
			monthEng = "January";
			break;
		case 2:
			monthEng = "February";
			break;
		case 3:
			monthEng = "March";
			break;
		case 4:
			monthEng = "April";
			break;
		case 5:
			monthEng = "May";
			break;
		case 6:
			monthEng = "June";
			break;
		case 7:
			monthEng = "July";
			break;
		case 8:
			monthEng = "August";
			break;
		case 9:
			monthEng = "September";
			break;
		case 10:
			monthEng = "October";
			break;
		case 11:
			monthEng = "November";
			break;
		case 12:
			monthEng = "December";
			break;	
		default:
			System.out.println("error");
			break;
		}
		
		System.out.println(month + "월은 \'" + monthEng + "\'입니다.");
		
	
	}

}
