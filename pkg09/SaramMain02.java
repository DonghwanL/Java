package pkg09;

public class SaramMain02 {

	public static void main(String[] args) {
		// Saram02 Ŭ������ ���� ���� ���� ��
		// getter, setter�� ����Ͽ� ���α׷���
		
		Saram02 soo = new Saram02();
		
		soo.setName("��ö��");
		soo.setHobby("��ȭ ����");
		soo.setBlood("AB");
		soo.setHeight(173.2);
		soo.setWeight(71.2);
		soo.setBool(true);
		
		showData(soo); // ȣ��
	}

	private static void showData(Saram02 human) {
		System.out.println("�̸� : " + human.getName());
		System.out.println("��� : " + human.getHobby());
		System.out.println("������ : " + human.getBlood());
		System.out.println("Ű : " + human.getHeight());
		System.out.println("������ : " + human.getWeight());
		System.out.println("������ : " + human.getBool());
	}

}
