package pkg07;

public class Method12 {

	public static void main(String[] args) {
		int a = 5, b = 8, c = 4;
		int[] arr = {20, 50, 10, 32};
		
		int result = min(a, b); // 5
		System.out.println("a, b의 최소 값 : " + min(a, b));
		
		result = min(a, b, c); // 4
		System.out.println("a, b, c의 최소 값 : " + min(a, b, c));
		
		result = min(arr); // 10
		System.out.println("arr의 최소 값 : " + min(arr));
	}
	
	static int min(int[] arr) {
		int result = 99999999;
		
		for (int i = 0; i < arr.length; i++) {
			if (result > arr[i]) {
				result = arr[i];
			} 
		}
		
		return result;
	}

	static int min(int a, int b, int c) {
		int result = Math.min(a, b);
		result = Math.min(result, c);
		
		return result;
	}

	static int min(int a, int b) { 
				
		return Math.min(a, b);
	}

}
