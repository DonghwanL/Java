package pkg21;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {

	public static void main(String[] args) {
		
		Person soo = new Person("��ö��", 30, 40, 50);
		Person hee = new Person("�ڿ���", 70, 80, 90);
		
		List<Person> lists = new ArrayList<Person>();
		
		lists.add(soo);
		lists.add(hee);
		lists.add(new Person("ȫ�浿", 40, 50, 60));
		
		// �� ����� html ������ �Ѱܼ� ���
		Personhtml html = new Personhtml(lists);
		html.SelectAll();
	}

}
