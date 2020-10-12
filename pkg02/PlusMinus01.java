package pkg02;

public class PlusMinus01 {

	public static void main(String[] args) {
		int a = 10, b = 20, c;
		
		c = ++a + b++;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		// 현재 a = 11, b = 21, c = 31
		c = a++ + --b;
		
		System.out.println("a : " + a); // 3) 12
		System.out.println("b : " + b); // 1) 20
		System.out.println("c : " + c); // 2) c = 11 + 20 = 31
		
		a = 15;
		b = 12;
		c = --a + --b;
		
		System.out.println("a : " + a); // 1) --a = 15 - 1 = 14
		System.out.println("b : " + b); // 2) --b = 12 - 1 = 11
		System.out.println("c : " + c); // 3) c = a + b = 14 + 11 = 25
		
		// 현재 a = 14, b = 11, c = 25
		
		--a; // 1) 14 - 1 = 13
		c += a-- + ++b; // 2) ++b = b + 1 = 12 
		                // 3) c = c + a + b  = 25 + 13 + 12 = 50
					 	// 4) a-- = 13 - 1 = 12
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
	
	}

}
