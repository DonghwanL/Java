package myunicon;

public class Unicon extends Animal implements Horse, Bird {

	public Unicon(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		String imsi = "���̰� " + super.getAge() + "���� ";
		imsi += super.getName() + "��(��) ";
		imsi += "�ü� " + Bird.speed + "���� ���� �ٴմϴ�.";
		System.out.println(imsi);
	}

	@Override
	public void run() {
		String imsi = "���̰� " + super.getAge() + "���� ";
		imsi += super.getName() + "��(��) ";
		imsi += "�޸��� �ӵ� " + Horse.speed + "���� �޸��ϴ�.";
		System.out.println(imsi);
	}

}
