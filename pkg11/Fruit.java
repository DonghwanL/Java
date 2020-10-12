package pkg11;
import java.util.Scanner;

public class Fruit {
	private String item;
	private int qty;
	private int price;
	private double discount = 0.0;
	private double amount;
	private Scanner scan;

	public Fruit() {
		scan = new Scanner(System.in);
		this.InputData();
		this.Compute();
	}
	
	public void Display() {
		System.out.println("ǰ�� : " + this.item);
		System.out.println("���� : " + this.qty);
		System.out.println("�ݾ� : " + this.amount);
	}
	
	private void Compute() {
		this.amount = this.qty * this.price;
		
		if (this.amount >= 10000) {
			this.discount += 0.05;
		}
		
		if (this.item.equals("�ٳ���")) {
			this.discount += 0.03;
		}
		
		this.amount *= (1.0 - this.discount);
	}
		
//		if (total >= 10000) {
//			this.discount = total * 0.05;
//		} else if (this.name.equals("�ٳ���")) {
//			this.discount = total * 0.03; 
//		} else if (this.name.equals("�ٳ���") && total >= 10000) {
//			this.discount = total * 0.08;
//		} else {
//			this.price = total;
//		}
//		
//		this.price = total - this.discount;
//	}

	public void InputData() {
		System.out.print("ǰ���� �Է����ּ���. >");
		this.item = scan.next();
		
		System.out.print("������ �Է����ּ���. >");
		this.qty = scan.nextInt();
		
		System.out.print("�ܰ��� �Է����ּ���. >");
		this.price = scan.nextInt();
	}
	
}
