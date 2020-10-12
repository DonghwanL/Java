package pkg12;

public class Result extends Sungjuk {
	public Result(String name, int kor, int eng, int math) {
		super(name, kor, eng, math);
	}

	public void getData() {
		super.Display();
		this.Display();
	}
	
	@Override
	public void Display() {
		int total = super.getKor() + super.getEng() + super.getMath();
		double average = (double)total / 3.0;
		
		System.out.printf("Á¦½ÃÄ«ÀÇ ÃÑÁ¡ : %d, Æò±Õ %f\n", total, average);
	}
}
