package pkg04;
public class SunToOne {

	public static void main(String[] args) {
		// 1부터 n까지의 합 구하기
		int su = 9;
		int total = 0;
		
		for (int i = 1; i <= su; i++) {
			total += i;
		}
		
		System.out.println("총합 01 : " + total);
		
		
		// su1부터 su2까지의 총합 구하기
		int su1 = 2;
		int su2 = 5;
		total = 0;
		
		for (int i = su1; i <= su2; i++) {
			total += i;
		}
		
		System.out.println("총합 02 : " + total);
		
		// su1부터 su2까지의 총합 구하기
		
		su1 = 6;
		su2 = 3;
		total = 0;
		
		for (int i = su2; i <= su1; i++) {
			total += i;
		}
		
		System.out.println("총합 03 : " + total);
		
		// swap
		
		int temp;
		temp = su2;
		su2 = su1;
		su1 = temp;
		total = 0;
		
		for (int i = su1; i <= su2; i++) {
			total += i;
		}
		
		System.out.println("총합 04 : " + total);
		
		
		// 1의 제곱은 1
		// 2의 제곱은 4
		// ...
		// 10의 제곱은 100
		
		total = 0;

		for (int i = 1; i < 11; i++) {
			String result = "%d의 제곱은 %d입니다. \n";
			System.out.printf(result, i, i*i);
		}
		
		

	}

}
