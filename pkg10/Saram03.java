package pkg10;

public class Saram03 {
	private String name;
	private String hobby;
	private String blood;
	private double height;
	private double weight;
	
	public Saram03() {
		this.name = "��ö��";
		this.hobby = "��ȭ ����";
		this.blood = "AB";
		this.height = 175.2;
		this.weight = 71.3;
	}
	
	public Saram03(String name, double height, double weight, String hobby, String blood) {
		this.name = name;
		this.hobby = hobby;
		this.blood = blood;
		this.height = height;
		this.weight = weight;
	}
	
	public void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("��� : " + this.hobby);
		System.out.println("������ : " + this.blood);
		System.out.println("Ű : " + this.height);
		System.out.println("������ : " + this.weight);
		System.out.println();
	}

}

