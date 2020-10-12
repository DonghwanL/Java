package pkg08;

public class Variable { 
	static int x; // static 변수
	int y; // 인스턴스 변수
	final double pi = 3.14; // 상수
	
	void hohoho(String msg) {
		// pi = 5.14;
		System.out.println(pi);
		
		// msg는 매개 변수로써 지역 변수의 한 종류이다.
		int z = 300; // 지역 변수
		System.out.println(z);
		System.out.println(msg);

	}
	
}
