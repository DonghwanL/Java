package pkg09;
public class StaticTest {
	int x = 100;
	static int y = 200;
	
	static void add(int x, int y) { // static �޼ҵ�
		int result = x + y;
		System.out.println(result);
	}
	
	void hello(String aa) { // �ν��Ͻ� �޼ҵ�
		System.out.println(aa);
	}
	
	public static void main(String[] args) { // static �޼ҵ�
		StaticTest obj = new StaticTest();
		
		System.out.println(obj.x);
		System.out.println(StaticTest.y);
		
		add(10, 20);	
		obj.hello("�ȳ��ϼ���.");
		
	}

}
