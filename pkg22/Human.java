package pkg22;
public class Human {
	private String name; // �̸�
	private String password; // ��й�ȣ
	private int age; // ����
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	
}
