package pkg12;

public class Mysub extends Mysuper {
	int y = 200;

	public Mysub() {
//		super(); ����Ŭ������ ��� �����ڿ��� �Ͻ������� super() ������ ��������.
		System.out.println("a");
	}
	
	public Mysub(String name) {
//		super(); ����Ŭ������ ��� �����ڿ��� �Ͻ������� super() ������ ��������.
		super(name);
		super.setName(name);
		System.out.println("c");
	}
}
