package pkg12;

public class Mother05 {
	private String name; // 이름
	private int age; // 나이
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Mother05(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Mother05() {
		
	}
	
	public void Display() {
		System.out.printf("%s는 %d살 입니다.\n", this.name, this.age);
	}
}
