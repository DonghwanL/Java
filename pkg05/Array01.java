package pkg05;

public class Array01 {

	public static void main(String[] args) {
		// �����ϴ� ����/�� �׷��� ������� �����ϰ� ����ϴ� ���α׷� �ۼ�
		String[] ses = new String[3];

		ses[0] = "����";
		ses[1] = "�ٴ�";
		ses[2] = "��";

		for (int i = 0; i < ses.length; i++) {
			System.out.println(ses[i]);
		}

		String[] ses2 = {"����", "�ٴ�", "��"};
		for (int i = 0; i < ses.length; i++) {
			System.out.println(ses2[i]);
		}
	}

}
