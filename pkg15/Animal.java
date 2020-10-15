package pkg15;

public abstract class Animal {
	private String name; // �̸�
	private String location; // ������
	
	public abstract void move(); // �����̱� (�߻�޼ҵ�)
	
	public Animal(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
}
