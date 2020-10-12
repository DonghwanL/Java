package pkg10;

public class Student {
	private String name;
	private int kor = 80;
	private int eng = 70;
	private int math = 50;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}
	
	public void Display() {
		int total = this.kor + this.eng + this.math;
		double average = total / 3.0;
		
		String imsi = "%s의 총점은 %d점이고, 평균은 %.2f점입니다.\n";
		System.out.printf(imsi, this.name, total, average);
	}
}
