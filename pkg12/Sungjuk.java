package pkg12;

public class Sungjuk {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public Sungjuk(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void Display() {
		System.out.printf("%s 국어 : %d, 영어 : %d, 수학 : %d\n", this.name, this.kor, this.eng, this.math);
	}
	
}
