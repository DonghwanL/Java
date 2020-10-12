package pkg04;

public class TotalSum {

	public static void main(String[] args) {
		// 1 + 1/2 + 1/3 + ... + + 1/99 + 1/100 = 5.1873
		double total = 0;
		
		for (int i = 1; i < 101; i++) {
			total += (double)1/i;
		}
		
		System.out.println("결과 : " + total);
		
		
		// 0/1 + 1/2 + 2/3 + ... + 99/100 = 94.8126
		total = 0;
		
		for (int i = 1; i < 101; i++) {
			total += (double)(i-1)/i;
		}
		
		System.out.println("결과 : " + total);

	}

}
