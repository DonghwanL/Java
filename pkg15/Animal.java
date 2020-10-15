package pkg15;

public abstract class Animal {
	private String name; // 이름
	private String location; // 서식지
	
	public abstract void move(); // 움직이기 (추상메소드)
	
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
