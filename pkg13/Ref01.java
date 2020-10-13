package pkg13;

class Animal {
	int x = 100;

	public void cry() { // ���� ����
		System.out.println("������ ¢�´�.");
	}

	@Override
	public String toString() {
		String imsi = "���� : " + this.x + "����";
		return super.toString() + "\n" + imsi;
	}
}

class Dog extends Animal {
	int y = 200;

	@Override
	public String toString() {
		String imsi = "������ : " + this.y + "����";
		return super.toString() + "\n" + imsi;
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("����̰� �߿��ϰ� ��ϴ�.");
	}
}

public class Ref01 {
	public static void main(String[] args) {
		Animal animal = new Dog(); // �±�
		System.out.println(animal.x);
		// System.out.println(animal.y); // �ѽ������� �Ⱥ���

		// toString() �޼ҵ� ȣ��
		System.out.println(animal);

		animal.cry();
		showData(animal);

		// ���� 2���� ������ �迭
		Animal[] myani = new Animal[2];

		// ��ü ����
		myani[0] = new Dog();
		myani[1] = new Cat();

		for (int i = 0; i < myani.length; i++) {
			showData(myani[i]);
		}
	}

	private static void showData(Animal animal) {
		if (animal instanceof Dog) {
			System.out.println("������");
			Dog dog = (Dog) animal;
			System.out.println("dog.x : " + dog.x);
			System.out.println("dog.y : " + dog.y);
			dog.cry();

		} else if (animal instanceof Cat) {
			System.out.println("�����");
			Cat cat = (Cat) animal;
			System.out.println("cat.x : " + cat.x);
			cat.cry();

		} else {
			System.out.println("some animal");
		}

	}

}
