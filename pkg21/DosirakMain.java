package pkg21;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {

	public static void main(String[] args) {
		
		// 고객 김철수
		Saram soo = new Saram("김철수", "마포 공덕동"); 

		String[] banchan1 = new String[] { "고급 어묵", "김치", "단호박 샐러드" };
		Dosirak dosirak1 = new Dosirak(soo, "매화 도시락", 10000, banchan1);

		// 도시락 정보를 저장하기 위한 컬렉션
		List<Dosirak> lists = new ArrayList<Dosirak>();
		lists.add(dosirak1);
		
		
		// 고객 박영희
		lists.add(new Dosirak(
					new Saram("박영희", "용산 도원동"),
					"진달래 도시락",
					7000,
					new String[] {"계란 후라이", "김", "마른 멸치"} ));
					
		
		Dosirakhtml html = new Dosirakhtml(lists);
		html.Delivery();
		}
	}

