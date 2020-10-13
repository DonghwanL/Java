package pkg13;

public class RefTest {

	public static void main(String[] args) {
		Mysuper obj01 = new Mysub(); // 승급
		
		System.out.println(obj01.a);
		
		// 일시적 접근이 불가능
//		System.out.println(obj01.b);
		
		Mysub sub = (Mysub)obj01; // 강등
		System.out.println(sub.a);
		System.out.println(sub.b);
		
		obj01.haha();
		sub.hoho();
		obj01.Display(); 
	}

}
