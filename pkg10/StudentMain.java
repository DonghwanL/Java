package pkg10;

public class StudentMain {

	public static void main(String[] args) {
		Student jessica = new Student("����ī", 50, 60, 70);
		jessica.Display();
		
		Student tiffany = new Student("Ƽ�Ĵ�", 60, 50); //���� ������
		tiffany.Display();
		
		Student taeyeon = new Student("�¿�", 30); //���� ���� ������
		taeyeon.Display();
	}

}