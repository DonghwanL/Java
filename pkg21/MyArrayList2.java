package pkg21;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {

	public static void main(String[] args) {
		
		Person soo = new Person("김철수", 30, 40, 50);
		Person hee = new Person("박영희", 70, 80, 90);
		
		List<Person> lists = new ArrayList<Person>();
		
		lists.add(soo);
		lists.add(hee);
		lists.add(new Person("홍길동", 40, 50, 60));
		
		// 이 결과를 html 문서에 넘겨서 출력
		Personhtml html = new Personhtml(lists);
		html.SelectAll();
	}

}
