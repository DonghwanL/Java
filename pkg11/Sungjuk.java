package pkg11;
import java.util.Scanner;

public class Sungjuk {
	private int finalexam;
	private int midexam;
	private int report;
	private int attendance;
	private double sungjuk = 0.0;
	private String hakjum = "";
	private String comment = "";
	private Scanner scan;
	
	public Sungjuk() {
		scan = new Scanner(System.in);
		this.Inputdata();
		this.calcSunguk();
		this.getHakjum();
	}
	
	public void Inputdata() {
		System.out.print("�߰���� ������ �Է��ϼ���. >");
		this.midexam = scan.nextInt();
		System.out.print("�⸻��� ������ �Է��ϼ���. >");
		this.finalexam = scan.nextInt();
		System.out.print("����Ʈ ������ �Է��ϼ���. >");
		this.report = scan.nextInt();
		System.out.print("�⼮ ������ �Է��ϼ���. >");
		this.attendance = scan.nextInt();
	}
	
	public void calcSunguk() {
		this.sungjuk = 
				this.midexam * 0.3 +
				this.finalexam * 0.3 +
				this.report * 0.2 +
				this.attendance * 0.2;
	}
	
	public void getHakjum() {
		if(this.sungjuk >= 90.0) {
			this.hakjum = "A";
			this.comment = "Excellent";
		} else if(this.sungjuk >= 80.0) {
			this.hakjum = "B";
			this.comment = "Excellent";
		} else if(this.sungjuk >= 70.0) {
			this.hakjum = "C";
			this.comment = "Good";
		} else if(this.sungjuk >= 60.0) {
			this.hakjum = "D";
			this.comment = "Good";
		} else {
			this.hakjum = "F";
			this.comment = "Foor";
		}
	}
	
	
	public void Display() {
		System.out.println("���� : " + this.sungjuk);
		System.out.println("���� : " + this.hakjum);
		System.out.println("�� : " + this.comment);
	}
	
}
