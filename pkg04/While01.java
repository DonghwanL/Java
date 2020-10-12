package pkg04;

public class While01 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;
		
		while(i < 11) {
			total += i; // ÇÒ ÀÏ
			i++;
		}
		
		System.out.println("ÃÑÇÕ 01 : " + total);
		
		
		// 1 + 4 + 7 +...+ 100 = 1717
		total = 0;
		i = 1;
		
		while(i < 101) {
			total += i; // ÇÒ ÀÏ
			i+=3;
		}
		
		System.out.println("ÃÑÇÕ 02 : " + total);
		
		
		total = 0;
		i = 1;
		
		while(i < 11) {
			total += 2 * i + 1; // ÇÒ ÀÏ
			i++;
		}
		
		System.out.println("ÃÑÇÕ 03 : " + total);
		
		
		// 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
		
		total = 0;
		i = 1;
		
		while(i < 97) {
			total += i * i; // ÇÒ ÀÏ
			i+=5;
		}
		
		System.out.println("ÃÑÇÕ 04 : " + total);
		
		
	}

}
