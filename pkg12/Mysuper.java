package pkg12;

public class Mysuper {
	int x = 100;
	private String name;
	private String hello = "�ȳ��ϼ���."; // ��� �Ұ����� ����
	
	public Mysuper() {
		System.out.println("b");
	}
	
	public Mysuper(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayhello() {
		System.out.println("�λ縻 : " + this.hello);
	}
	
}
