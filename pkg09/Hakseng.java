package pkg09;

public class Hakseng {
	private String name;
	private int grade;
	private int ban;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getBan() {
		return ban;
	}
	
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	private int TotalSum() { // ���� �����ִ� �޼ҵ�
		return this.kor + this.eng + this.math;
	}

	public void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("�г�/�� : " + this.grade + "/" + this.ban);
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
		System.out.println("���� : " + this.math);
		
		int total = this.kor + this.eng + this.math; 
		double average = (double)total / 3.0; 
				
		System.out.println("���� : " + total);
		System.out.println("����2 : " + this.TotalSum());
		System.out.println("��� : " + average);
	}
	
}
