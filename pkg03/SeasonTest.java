package pkg03;

public class SeasonTest {

	public static void main(String[] args) {
		// ���� ����ϱ�
		int month = 9;
		String season = "";
		
		// 9���� "����" �Դϴ�.
		
		if(month >= 3 && month <= 5) {
			season = "��";
		} else if (month >= 6 && month <= 8) {
			season = "����";
		} else if (month >= 9 && month <= 11) {
			season = "����";
		} else {
			season = "�ܿ�";
		}
		
		String temp = month + "���� \"" + season + "\" �Դϴ�.";
		System.out.println(temp);

	}

}
