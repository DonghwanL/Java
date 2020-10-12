package pkg07;

public class Method06 {
	
	/*
	 총합 구하기
	 1부터 10까지의 총합을 구하여 출력하는 메소드 sum 작성
	 단, 값을 반환하지 않고 메소드 내부에서 출력하도록 합니다.
	 
	 hap 메소드 : sum 메소드와 동일한 역할을 수행하고 반환해주는 메소드.
	 */

	public static void main(String[] args) {
		int su = 10;
		int result = hap(su);
		System.out.println("결과 01 : " + result);
		sum(su);
	}
	
	static void sum(int x) {
		int result = 0;
		
		for (int i = 1; i <= x; i++) {
			result += i;
		}
		
		System.out.println("결과 02 : " + result);
	}
	
	
	static int hap(int x) {
		int result = 0;
		
		for (int i = 1; i <= x; i++) {
			result += i;
		}
		
		return result;
	}
	
	
}
