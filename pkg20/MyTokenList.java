package pkg20;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyTokenList {

	public static void main(String[] args) {
		String str = "¼Ò³à½Ã´ë ¿ø´õ°É½º ºò¹ð";
		
		StringTokenizer st1 = new StringTokenizer(str);
		
		int cnttoken = st1.countTokens();
		
		String[] arr = new String[cnttoken];
		
		for (int i = 0; i < cnttoken; i++) {
			arr[i] = st1.nextToken();
		}
		
		List<Object> arrList = new ArrayList<Object>();
		arrList.add(arr);
		
		PrintFor(arrList);
	}

	
	private static void PrintFor(List<Object> arrList) {
		for (Object item : arrList) {
			System.out.println(item);
		}
	}

}
