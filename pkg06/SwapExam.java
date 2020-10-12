package pkg06;

public class SwapExam {

	public static void main(String[] args) {
		int x = 3, y = 4;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		x = 3;
		y = 4;
		int z = 5;
		
		temp = z; // 5
		z = y; // 4
		y = x; // 3
		x = temp; // 5
		
		System.out.println("x : " + x); // 5
		System.out.println("y : " + y); // 3
		System.out.println("z : " + z); // 4
		
		int[] arr = {1, 2, 3, 4};
		
		// 배열 요소들의 값을 거꾸로 뒤집어서 출력하시오
		// 배열 오소들을 swap 기법을 이용하여 값들을 서로 맞 바꾸면 된다.
		int cnt = arr.length / 2; // swap 회수
		
		System.out.println("배열 요소 뒤집기");
		for (int i = 0; i < cnt; i++) {
			// i = 0
//			temp = arr[0]; 		
//			arr[0] = arr[3];
//			arr[3] = temp;
			
			temp = arr[i];
			arr[i] = arr[arr.length -1 - i];
			arr[arr.length -1 - i] = temp;
			
			// i = 1
//			temp = arr[1];
//			arr[1] = arr[2];
//			arr[2] = temp;
			
			
		}
		
		System.out.println("배열 요소 출력하기");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
