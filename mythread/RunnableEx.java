package mythread;
import java.util.Random;

class some {
	
}

public class RunnableEx extends some implements Runnable {

	@Override
	public void run() {
		String[] arr = {"이효리", "이문세", "소녀시대", "블랙핑크", "SES"};
		
		try {
			for (int i = 0; i < 100; i++) {
				String item = arr[new Random().nextInt(arr.length)];
				System.out.println(item);
				Thread.sleep(2000);
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
