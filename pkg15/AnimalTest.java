package pkg15;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animal  = new Animal[3];
		
		animal[0] = new Lion("����", "������ī �ʿ�"); // �±�
		animal[1] = new Eagle("������", "�ϴ�");
		animal[2] = new Goldfish("�ݺؾ�", "����");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
		
//		Animal ani = new Animal(); 

	}

}
