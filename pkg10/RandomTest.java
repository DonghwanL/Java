package pkg10;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// �ֻ��� 5�� ������, Random Ŭ����
		// rand ��ü : ������ ���� ȣ���� �� �ֽ��ϴ�.
		
		Random rand = new Random();
		
		int total = 0;
		
		for (int i = 1; i <= 5; i++) {
			int su = rand.nextInt(6) + 1;
			System.out.println(su);
			total += su;
		}
		
		System.out.println("���� : " + total);
		

	}

}
