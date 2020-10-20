package pkg18;
import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// ������ �迭 5���� �����ϰ�, �� �Ǵ� ������ �����մϴ�.
		boolean[] bool = new boolean[5];
		for (int i = 0; i < bool.length; i++) {
			bool[i] = rand.nextBoolean();
			System.out.println(bool[i] + "\t");
		}
		System.out.println();
		
		boolean res = rand.nextBoolean();
		System.out.println(res);
		
		// 0.0�̻� 1.0�̸��� �Ǽ� ���� ��ȯ�մϴ�.
		double dbl = rand.nextDouble();
		System.out.println(dbl);
		
		// nextInt(n) : 0���� (n-1)������ ������ ���� 1���� �����մϴ�.
		int jungsu = rand.nextInt(6) + 1;
		System.out.println(jungsu);
		
		// �ֻ��� 3�� ������
		int total = 0;
		int[] jusawee = new int[3];
		
		System.out.println("�ֻ��� " + jusawee.length + "�� ������");
		
		for (int i = 0; i < jusawee.length; i++) {
			jusawee[i] = rand.nextInt(6) + 1;
			total += jusawee[i];
			
			if (i == (jusawee.length - 1)) {
				System.out.print(jusawee[i] + " = ");
			} else {
				System.out.print(jusawee[i] + " + ");
			}
		}
		System.out.println(total);

		
		// ���� �� �õ� �����ϱ�
		// �õ� �� : ���� �޼ҵ忡 �־� �ִ� ���� ������ �ǹ��մϴ�.
		// �õ� ���� �־� �ִ� ������ �õ� �����̶�� �մϴ�.
		// �Ϲ������� �õ� ������ ���� ������, �׻� ������ �������� ���� ���� ó���Ϸ��� �õ� ������ ����� �մϴ�.
		// ������ 1234�� ���� �õ� ���� ���� ���� ���� �ݴϴ�.
		System.out.println("�õ� ���� ����");
		
		long seed = 1234;
		Random rand2 = new Random(seed);
		for (int i = 0; i < 10; i++) {
			int rnd = rand2.nextInt(6) + 1;
			System.out.println(rnd);
		}
		

	}

}
