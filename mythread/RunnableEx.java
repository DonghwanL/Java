package mythread;
import java.util.Random;

class some {
	
}

public class RunnableEx extends some implements Runnable {

	@Override
	public void run() {
		String[] arr = {"��ȿ��", "�̹���", "�ҳ�ô�", "����ũ", "SES"};
		
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
