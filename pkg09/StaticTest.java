package pkg09;
public class StaticTest {
	int x = 100;
	static int y = 200;
	
	static void add(int x, int y) { // static 메소드
		int result = x + y;
		System.out.println(result);
	}
	
	void hello(String aa) { // 인스턴스 메소드
		System.out.println(aa);
	}
	
	public static void main(String[] args) { // static 메소드
		StaticTest obj = new StaticTest();
		
		System.out.println(obj.x);
		System.out.println(StaticTest.y);
		
		add(10, 20);	
		obj.hello("안녕하세요.");
		
	}

}
