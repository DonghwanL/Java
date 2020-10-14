package polymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("��ö��");
		
		Car[] carlist = new Car[3]; // �迭 ����
		
		// �±޿� ���� ��ü ����
		carlist[0] = new Tico("�� Ƽ��", 400, "����");
		carlist[1] = new Spark("�� ����ũ", 500, "����");
		carlist[2] = new Cube("�� ť��", 600, 12.3);
		
		System.out.println("=========================");
		for (int i = 0; i < carlist.length; i++) {
			soo.ride(carlist[i]);
			System.out.println();
		}
		
		
		System.out.println("=========================");
		Car[] cararray = 
			{
				new Tico("�� Ƽ��", 700, "�߾��� ����"),
				new Spark("�� ����ũ2", 800, "�Ｚ"),
				new Cube("�� ť��", 900, 12.3)
			};
		
		for (int i = 0; i < cararray.length; i++) {
			soo.ride(cararray[i]);
			System.out.println();
		}
	}

}
