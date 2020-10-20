package pkg18;

import java.util.Arrays;
import java.util.List;

public class MyArrayExam {

	public static void main(String[] args) {
		String[] arr1 = new String[3];
		
		Arrays.fill(arr1, "제시카");
		
		Arrays.fill(arr1, 1, 3, "티파니"); // 1번부터 3번째 전까지 (1~2)
		
		Arrays.fill(arr1, 2, 3, "써니"); // 2번째 요소만 채우기
		
		
		printArray(arr1);
		
		
		String[] arr2 = {"제시카", "티파니", "써니"};
		String[] arr3 = {"제시카", "티파니", "써니", "효연"};
		
		// equals
		System.out.println(Arrays.equals(arr1, arr2));
		boolean bool = Arrays.equals(arr1, arr3);
		System.out.println(bool);
		
		// binarySearch
		int idx = Arrays.binarySearch(arr3,"효연");
		System.out.println("효연의 인덱스 : " + idx);
		
		// asList
		String[] arr4 = {"김유신", "이순신", "강감찬"};
		List<String> lists = Arrays.asList(arr4);
		System.out.println(lists);
		
		// copyOf
		String[] arr5 = {"김유신", "이순신", "강감찬", "안중근", "윤봉길"};
		System.out.println("배열을 복사해서 새 배열 만들기");
		for (int i = 1; i <= 10; i++) {
			String[] arr6 = Arrays.copyOf(arr5, i);
			printArray(arr6);
		}
		System.out.println();
		
		// copyOfRange
		String[] arr7 = Arrays.copyOfRange(arr5, 1, 4);
		printArray(arr7);
		
		// sort
		Arrays.sort(arr5);
		printArray(arr5);
		
		String[] arr8 = {"나", "가", "아", "다", "라"};
		Arrays.sort(arr8, 1, 4); // 1에서 3번까지만 정렬
		printArray(arr8);
		
		// toString
		System.out.println(Arrays.toString(arr5));
	}

	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
