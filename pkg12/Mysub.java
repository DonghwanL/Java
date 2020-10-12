package pkg12;

public class Mysub extends Mysuper {
	int y = 200;

	public Mysub() {
//		super(); 서브클래스의 모든 생성자에는 암시적으로 super() 구문이 숨어있음.
		System.out.println("a");
	}
	
	public Mysub(String name) {
//		super(); 서브클래스의 모든 생성자에는 암시적으로 super() 구문이 숨어있음.
		super(name);
		super.setName(name);
		System.out.println("c");
	}
}
