package mythread;

import java.util.Random;

public class RandomCreator extends Thread {

	@Override
	public void run() {
		// 1�ʿ� �ѹ��� ���� �� ����ϱ�
		Random rand = new Random();

		try {
			int total = 0;
			
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				int rnd = rand.nextInt(6) + 1;
				System.out.println((i + 1) + "��° �ֻ��� �� : " + rnd);
				total += rnd;
			}
			System.out.println("���� : " + total);

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}