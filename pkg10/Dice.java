package pkg10;

import java.util.Random;

public class Dice {
	private String name; // �̸�
	private int[] arr; // ��� �� ������ �迭
	private int num; // ���� Ƚ��
	private Random rand = new Random();

	public void getInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.print("�ֻ��� �� : ");
		
		for (int i = 0; i < this.arr.length; i++) {
			if (i == (this.arr.length - 1)) {
				System.out.print(this.arr[i]);
			} else {
				System.out.print(this.arr[i] + ", ");
			}
		}
		System.out.println();
		
		System.out.println("�հ� : " + this.total());
		System.out.println("====================");
	}

	public Dice(String name) {
		this.name = name;
		this.num = 3;
		this.arr = new int[this.num];
		this.roll();
	}

	public Dice(String name, int num) {
		this.name = name;

		if (num >= 4) {
			this.num = 3;
		} else {
			this.num = num;
		}

		this.arr = new int[this.num];
		this.roll();
	}

	// �ֻ����� ������ �޼ҵ�
	private void roll() {
		for (int i = 0; i < this.num; i++) {
			this.arr[i] = this.rand.nextInt(6) + 1;
		}
	}

	// �հ� �޼ҵ�
	private int total() {
		int total = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			total += this.arr[i];
		}
		return total;
	}

}
