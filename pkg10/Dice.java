package pkg10;

import java.util.Random;

public class Dice {
	private String name; // 이름
	private int[] arr; // 결과 값 저장할 배열
	private int num; // 던질 횟수
	private Random rand = new Random();

	public void getInfo() {
		System.out.println("이름 : " + this.name);
		System.out.print("주사위 값 : ");
		
		for (int i = 0; i < this.arr.length; i++) {
			if (i == (this.arr.length - 1)) {
				System.out.print(this.arr[i]);
			} else {
				System.out.print(this.arr[i] + ", ");
			}
		}
		System.out.println();
		
		System.out.println("합계 : " + this.total());
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

	// 주사위를 던지는 메소드
	private void roll() {
		for (int i = 0; i < this.num; i++) {
			this.arr[i] = this.rand.nextInt(6) + 1;
		}
	}

	// 합계 메소드
	private int total() {
		int total = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			total += this.arr[i];
		}
		return total;
	}

}
