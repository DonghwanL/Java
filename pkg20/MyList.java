package pkg20;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Object> lists = new ArrayList<Object>();
		
		lists.add("bigbang");
		lists.add("2ne1");
		lists.add("wonder");
		lists.add("kara");
		lists.add("2ne1");
		
		int idx = -1;
		
		// "2ne1"의 첫번쨰 인덱스
		idx = lists.indexOf("2ne1");
		System.out.println(idx);
		
		// "2ne1"의 마지막 인덱스
		idx = lists.lastIndexOf("2ne1");
		System.out.println(idx);
		
		// "girls"의 첫번째 인덱스
		idx = lists.indexOf("girls");
		System.out.println(idx);
		
		// 2번째 인덱스에 넣기
		lists.add(2, "girls");
		
		// 5번째 인덱스 변경
		lists.set(5, "2am");
		
		// 항목 wonder 삭제
		lists.remove(3);
		
		// 확장 for를 이용하여 출력
		PrintFor(lists);
		
		// get(index) 메소드를 이용하여 출력
		PrintGet(lists);
		
		// 2번째 요소 부터 3번째 요소까지를 subList로 추출하기
		List<Object> newlist = lists.subList(2, 4);
		
		System.out.println(newlist.toString());
		System.out.println(lists.toString());
		System.out.println("요소의 갯수 : " + lists.size());
	}

	private static void PrintGet(List<Object> lists) {
		System.out.println("get(index) 메소드를 이용한 출력");
		
		for (int i = 0; i < lists.size(); i++) {
			Object item = lists.get(i);
			// String item = (String)lists.get(i);
			System.out.println(item);
		}
	}

	private static void PrintFor(List<Object> lists) {
		System.out.println("확장 for를 이용한 출력");
		
		for(Object item : lists) {
			System.out.println(item);
		}
	}

}
