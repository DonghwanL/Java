package enumtest;

public class Shoes {
	String name; // 이름
	int size; // 사이즈
	ShoesType shoesType; // 신발의 유형
	ShoesTypeName shoesTypeName; // 한글 이름이 들어간 Enum 타입
	
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
		System.out.println("신발 이름 : " + this.name);
		System.out.println("신발 크기 : " + this.size);
		System.out.println("신발 코드 : " + this.shoesType);
	}

	public void Display2() {
		System.out.println("신발 이름 : " + this.name);
		System.out.println("신발 크기 : " + this.size);
		System.out.println("신발 코드 : " + this.shoesTypeName);
		System.out.println("신발 종류 : " + this.shoesTypeName.getName());
	}
	
	
}
