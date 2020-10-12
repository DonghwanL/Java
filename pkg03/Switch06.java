package pkg03;

public class Switch06 {

	public static void main(String[] args) {
		// ���� ó�� switch case
		int score = 75;
		String grade;
		String comment = "";
		
		switch(score/10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);
		
		
		// ������ A, B�̸� ���ϼ̽��ϴ�. 
		// ������ C, D�̸� �����Դϴ�.
		// �������� �� �� �й��ϼ���.
		
		switch(grade) {
		case "A": case "B":
			comment = "���ϼ̽��ϴ�.";
			break;
		case "C": case "D":
			comment = "�����Դϴ�.";
			break;
		default:
			comment = "�� �� �й��ϼ���.";
			break;		
		}
		
		System.out.println("�� : " + comment);

	}

}
