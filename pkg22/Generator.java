package pkg22;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	@Override
	public void run() {
		try {
			System.out.println("데이터 생성 중 입니다.");
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
		System.out.println("결과 출력");
		
		for (int i = 0; i < 10; i++) {
			int value = map.get(i);
			System.out.println(i + "\t" + value);
		}
		
		System.out.println("감사합니다.");
	}

}
