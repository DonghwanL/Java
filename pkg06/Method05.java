package pkg06;

public class Method05 {
	
	static int arrsum(int[] abcd) {
		int total = 0;
		for (int i = 0; i < abcd.length; i++) {
			total += abcd[i];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// 배열 요소들의 총합을 구해 주는 arrsum 메소드 구현
		
		int[]arr = {10, 20, 30};
		int result = arrsum(arr);
		
		System.out.println("총합 : " + result);

	}

}
