package pkg09;

public class Account06 {
	private String name; // 1 null
	private int age; // 0
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void hello(String msg) {
		System.out.println(msg);
	}
	
	void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		this.hello("��ȣ");
	}
}
