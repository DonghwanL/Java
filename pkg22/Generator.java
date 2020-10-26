package pkg22;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	@Override
	public void run() {
		try {
			System.out.println("������ ���� �� �Դϴ�.");
			for (int i = 0; i < 100; i++) {
				Thread.sleep(100);
				
				int key = new Random().nextInt(10) + 1;
				System.out.println(key);
				
				if (map.containsKey(key)) {
					int value = map.get(key).intValue();
					map.put(key, value + 1);
				} else {
					map.put(key, 1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintResult();
	}

	private void PrintResult() {
		System.out.println("��� ���");
		
		for (int i = 0; i < 10; i++) {
			int value = map.get(i);
			System.out.println(i + "\t" + value);
		}
		
		System.out.println("�����մϴ�.");
	}

}
