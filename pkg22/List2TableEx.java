package pkg22;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class List2TableEx {
	public static void main(String[] args) {
		Human kim = new Human("������", "1234", 10);
		Human lee = new Human("�̼���", "5678", 20);
		
		List<Human> lists = new ArrayList<Human>();
		
		lists.add(kim);
		lists.add(lee);
		lists.add(new Human("ȫ����", "3456", 30));
		
		
		HumanDao dao = new HumanDao();
		
		Hashtable<String, String> ht = dao.List2Table(lists);
		
		if (ht != null) {
			System.out.println(ht.toString());
		} else {
			System.out.println("null ������ �Դϴ�.");
		}
		
		dao.PrintTable(ht);
		
		
	}

}
