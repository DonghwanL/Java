package pkg05;

public class MyArr01 {

	public static void main(String[] args) {
		// 지역 변수는 반드시 초기화가 필요 합니다.
		int z = 0;
		System.out.println(z);

		int x = 3;
		int y = 5;

		// 정수 3개를 저장 가능한 배열 만들기
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("배열 요소 갯수 : " + arr.length);

		arr[0] = x - y + 6;
		arr[2] = arr[0] + 3;
		arr[1] = arr[0] + arr[2];

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		System.out.println("총합 01 : " + total);

		String[] soshi = { "태연", "효연", "티파니" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(soshi[i]);
		}

	}

}
