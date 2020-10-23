package pkg20;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyTokenList {

	public static void main(String[] args) {
		String str = "소녀시대 원더걸스 빅뱅";
		
		StringTokenizer st1 = new StringTokenizer(str);
		
		int cnttoken = st1.countTokens();
		
		// 이름, 크기, 타입
		String[] arr = new String[cnttoken];
		
		for (int i = 0; i < cnttoken; i++) {
			arr[i] = st1.nextToken();
		}
		
		List<Object> arrList = new ArrayList<Object>();
		
		for (String item : arr) {
			arrList.add(item); // 승급
		}
		
		PrintFor(arrList);
	}

	
	private static void PrintFor(List<Object> arrList) {
		for (Object item : arrList) {
			System.out.println(item);
		}
	}

}

