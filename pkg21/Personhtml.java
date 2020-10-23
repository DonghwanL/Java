package pkg21;

import java.text.DecimalFormat;
import java.util.List;

public class Personhtml {
	private List<Person> persons = null;
	private DecimalFormat df = null;
	
	public Personhtml(List<Person> persons) {
		this.persons = persons;
		String pattern = "###.00";
		this.df = new DecimalFormat(pattern);
	}

	public void SelectAll() {
		System.out.println("확장 for로 모든 멤버 출력하기");
		
		for(Person saram : persons) {
			String name = saram.getName();
			int kor = saram.getKor();
			int eng = saram.getEng();
			int math = saram.getMath();
			
			double total = kor + eng + math;
			double average = total / 3.0;
			
			String imsi = name + " : " + kor + " / " + eng + " / " + math + " / ";
			imsi += this.df.format(total) +  " / " + this.df.format(average);
			
			System.out.println(imsi);
		}
	}

}
