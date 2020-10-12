package pkg10;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return this.width * this.height;
	}

	public void perimiter() {
		int perimiter = (this.width + this.height) * 2;
		System.out.println("둘레 : " + perimiter);
	}

	public void result() {
		String comment;

		if (this.area() > 300) {
			comment = "대형";
		} else if (this.area() > 200) {
			comment = "중형";
		} else {
			comment = "소형";
		}

		System.out.println("타입 : " + comment);
	}

	public double diagonal() {
		double diag = 0.0;
		diag = Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0));

		return diag;
	}

}
