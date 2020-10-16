package enumtest;

public class Shoes {
	String name; // �̸�
	int size; // ������
	ShoesType shoesType; // �Ź��� ����
	ShoesTypeName shoesTypeName; // �ѱ� �̸��� �� Enum Ÿ��
	
	public Shoes(String name, int size, ShoesTypeName shoesTypeName) {
		super();
		this.name = name;
		this.size = size;
		this.shoesTypeName = shoesTypeName;
	}
	
	public Shoes(String name, int size, ShoesType shoesType) {
		super();
		this.name = name;
		this.size = size;
		this.shoesType = shoesType;
	}
	
	public void Display() {
		System.out.println("�Ź� �̸� : " + this.name);
		System.out.println("�Ź� ũ�� : " + this.size);
		System.out.println("�Ź� �ڵ� : " + this.shoesType);
	}

	public void Display2() {
		System.out.println("�Ź� �̸� : " + this.name);
		System.out.println("�Ź� ũ�� : " + this.size);
		System.out.println("�Ź� �ڵ� : " + this.shoesTypeName);
		System.out.println("�Ź� ���� : " + this.shoesTypeName.getName());
	}
	
	
}
