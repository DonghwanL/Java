package pkg03;

public class StringSwitch {

	public static void main(String[] args) {
		// ���ڸ� �̿��Ͽ� ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���. (switch case ����)
		// ��� ����) 2���� 'february'�Դϴ�.
		
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
		
		System.out.println(month + "���� \'" + monthEng + "\'�Դϴ�.");
		
	
	}

}
