package pkg03;

public class Switch05 {

	public static void main(String[] args) {
		// switch case ���� �ֻ���
		// �ֻ��� ���� ¦������ Ȧ������ �Ǵ�
		// ���� �ٸ� ���� �Է½� error��� ���
		
		int su = 5;
		
		System.out.println("���̽� 01");
		
		switch(su) {
		case 1:
			System.out.println("Ȧ��");
			break;
		case 2:
			System.out.println("¦��");
			break;
		case 3:
			System.out.println("Ȧ��");
			break;
		case 4:
			System.out.println("¦��");
			break;
		case 5:
			System.out.println("Ȧ��");
			break;
		case 6:
			System.out.println("¦��");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		su = 3;
		System.out.println("���̽� 02");
		
		switch(su) {
		case 1: 
		case 3: 
		case 5:
			System.out.println("Ȧ��");
			break;
		case 2: 
		case 4: 
		case 6:	
			System.out.println("¦��");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		
		// ���� ����ϱ�
		// 9���� "����" �Դϴ�.
		
		int month = 1;
		String comment = "";
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			comment = "��";
			break;	
		case 6:
		case 7:
		case 8:
			comment = "����";
			break;	
		case 9:
		case 10:
		case 11:
			comment = "����";
			break;	
		case 12:
		case 1:
		case 2:
			comment = "�ܿ�";
			break;	
		}
		
		System.out.println(month + "���� \"" + comment + "\" �Դϴ�.");
		
		
	}

}
