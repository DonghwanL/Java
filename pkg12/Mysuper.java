package pkg12;

public class Mysuper {
	int x = 100;
	private String name;
	private String hello = "안녕하세요."; // 상속 불가능한 변수
	
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
		System.out.println("인사말 : " + this.hello);
	}
	
}
