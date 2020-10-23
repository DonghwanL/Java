package pkg21;

import java.util.ArrayList;
import java.util.List;

public class MyHaksengList {

	public static void main(String[] args) {
		List<Hakseng> lists = new ArrayList<Hakseng>();
		
		lists.add(new Hakseng("±èÃ¶¼ö", 1, 3, 30, 40, 50));
		lists.add(new Hakseng("¹Ú¿µÈñ", 1, 4, 70, 80, 90));
		lists.add(new Hakseng("±èÃ¶¼ö", 1, 5, 40, 50, 60));
		
		Display(lists);

	}

	private static void Display(List<Hakseng> lists) {
		System.out.println("ÀÌ¸§\tÇĞ³â\t¹İ\t±¹¾î\t¿µ¾î\t¼öÇĞ\tÃÑÁ¡\tÆò±Õ");
		
		for (Hakseng hakseng : lists) {

			double total = hakseng.getKor() + hakseng.getEng() + hakseng.getMath();
			double average = total / 3.0;
			
			String imsi = "";
			imsi += hakseng.getName() + "\t";
			imsi += hakseng.getNo() + "\t";
			imsi += hakseng.getBan() + "\t";
			imsi += hakseng.getKor() + "\t";
			imsi += hakseng.getEng() + "\t";
			imsi += hakseng.getMath() + "\t";
			imsi += total + "\t";
			imsi += average + "\t";
			
			System.out.println(imsi);
		}

	}

}
