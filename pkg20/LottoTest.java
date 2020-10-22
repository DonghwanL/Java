package pkg20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTest {

	public static void main(String[] args) {
		int secondno = 0;

		Set<Integer> lotto = new HashSet<Integer>();
		Random rnd = new Random();

		while (lotto.size() < 7) {
			int su = rnd.nextInt(45) + 1;

			if (lotto.size() == 6) {
				secondno = su;
			}
			lotto.add(su);
		}

		lotto.remove(secondno);
		
		System.out.println("1�� ��ȣ : " + lotto.toString());
		System.out.println("2�� ��ȣ : [" + secondno + "]");

	}

}
