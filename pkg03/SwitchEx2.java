package pkg03;

public class SwitchEx2 {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		String grade = "B";
		String gift = "";

		System.out.println("���̽�01");

		switch (grade) {
		case "A":
			gift = "��������, ��� �¿���, ��Ʈ��";
			break;
		case "B":
			gift = "��� �¿���, ��Ʈ��";
			break;
		case "C":
			gift = "��Ʈ��";
			break;
		}

		System.out.println("�̸� : " + name);
		System.out.println("��� : " + grade);
		System.out.println("��ǰ : " + gift);

		
		System.out.println("���̽�02");

		gift = "";

		switch (grade) {
		case "A":
			gift += "��������, ";
		case "B":
			gift += "��� �¿���, ";
		case "C":
			gift += "��Ʈ��";

		System.out.println("�̸� : " + name);
		System.out.println("��� : " + grade);
		System.out.println("��ǰ : " + gift);
		
		}

	}

}
