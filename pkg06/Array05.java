package pkg06;

public class Array05 {

	public static void main(String[] args) {
		// 요소가 5개인 배열에서 값이 가장 큰 값을 구하세요.
		// 0번째 요소를 최대라고 가정, 반복문을 사용하여 현재 최대와 i번째 요소들의 값을 비교한다.
		// i번째 요소들의 값이 최대 값보다 크면 최대 값을 바꿉니다.

		double[] arr = { 0.5, 0.3, 0.2, 0.8, 0.4 };
		double max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		double min = arr[0] ; 

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}


}