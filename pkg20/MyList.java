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
		
		// "2ne1"�� ù���� �ε���
		idx = lists.indexOf("2ne1");
		System.out.println(idx);
		
		// "2ne1"�� ������ �ε���
		idx = lists.lastIndexOf("2ne1");
		System.out.println(idx);
		
		// "girls"�� ù��° �ε���
		idx = lists.indexOf("girls");
		System.out.println(idx);
		
		// 2��° �ε����� �ֱ�
		lists.add(2, "girls");
		
		// 5��° �ε��� ����
		lists.set(5, "2am");
		
		// �׸� wonder ����
		lists.remove(3);
		
		// Ȯ�� for�� �̿��Ͽ� ���
		PrintFor(lists);
		
		// get(index) �޼ҵ带 �̿��Ͽ� ���
		PrintGet(lists);
		
		// 2��° ��� ���� 3��° ��ұ����� subList�� �����ϱ�
		List<Object> newlist = lists.subList(2, 4);
		
		System.out.println(newlist.toString());
		System.out.println(lists.toString());
		System.out.println("����� ���� : " + lists.size());
	}

	private static void PrintGet(List<Object> lists) {
		System.out.println("get(index) �޼ҵ带 �̿��� ���");
		
		for (int i = 0; i < lists.size(); i++) {
			Object item = lists.get(i);
			// String item = (String)lists.get(i);
			System.out.println(item);
		}
	}

	private static void PrintFor(List<Object> lists) {
		System.out.println("Ȯ�� for�� �̿��� ���");
		
		for(Object item : lists) {
			System.out.println(item);
		}
	}

}
