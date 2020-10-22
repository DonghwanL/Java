package pkg20;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		
		set.add("제시카"); // String --> Object
		set.add(123); // int --> Integer --> Object 
		set.add(false);
		set.add("제시카");
		
		set.clear();
		
		set.add("제시카");
		set.add("티파니");
		set.add("수영");
		set.add("효연");
		
		System.out.println(set.contains("써니"));
		System.out.println(set.contains("수영"));
		
		set.remove("티파니");
		
		// "유리"가 있는지 확인하고, 없으면 추가하세요.
		
		if (!set.contains("유리")) {
			set.add("유리");
		} 
		
		System.out.println(set);
		
		System.out.println("요소 크기 : " + set.size());

	}

}
