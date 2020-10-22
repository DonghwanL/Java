package pkg20;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		
		set.add("����ī"); // String --> Object
		set.add(123); // int --> Integer --> Object 
		set.add(false);
		set.add("����ī");
		
		set.clear();
		
		set.add("����ī");
		set.add("Ƽ�Ĵ�");
		set.add("����");
		set.add("ȿ��");
		
		System.out.println(set.contains("���"));
		System.out.println(set.contains("����"));
		
		set.remove("Ƽ�Ĵ�");
		
		// "����"�� �ִ��� Ȯ���ϰ�, ������ �߰��ϼ���.
		
		if (!set.contains("����")) {
			set.add("����");
		} 
		
		System.out.println(set);
		
		System.out.println("��� ũ�� : " + set.size());

	}

}
