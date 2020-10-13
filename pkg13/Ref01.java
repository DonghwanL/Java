package pkg13;

class Animal {
	int x = 100;

	public void cry() { // 동작 구현
		System.out.println("동물이 짖는다.");
	}

	@Override
	public String toString() {
		String imsi = "동물 : " + this.x + "마리";
		return super.toString() + "\n" + imsi;
	}
}

class Dog extends Animal {
	int y = 200;

	@Override
	public String toString() {
		String imsi = "강아지 : " + this.y + "마리";
		return super.toString() + "\n" + imsi;
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
}

public class Ref01 {
	public static void main(String[] args) {
		Animal animal = new Dog(); // 승급
		System.out.println(animal.x);
		// System.out.println(animal.y); // 한시적으로 안보임

		// toString() 메소드 호출
		System.out.println(animal);

		animal.cry();
		showData(animal);

		// 동물 2마리 저장할 배열
		Animal[] myani = new Animal[2];

		// 객체 생성
		myani[0] = new Dog();
		myani[1] = new Cat();

		for (int i = 0; i < myani.length; i++) {
			showData(myani[i]);
		}
	}

	private static void showData(Animal animal) {
		if (animal instanceof Dog) {
			System.out.println("강아지");
			Dog dog = (Dog) animal;
			System.out.println("dog.x : " + dog.x);
			System.out.println("dog.y : " + dog.y);
			dog.cry();

		} else if (animal instanceof Cat) {
			System.out.println("고양이");
			Cat cat = (Cat) animal;
			System.out.println("cat.x : " + cat.x);
			cat.cry();

		} else {
			System.out.println("some animal");
		}

	}

}
