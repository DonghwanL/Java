package mythread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadEx soo = new ThreadEx("ö��");
		soo.start();
		
		new ThreadEx("����").start(); // ��ȸ�� ��ü ����
		
		RunnableEx mrun = new RunnableEx();
		Thread th = new Thread(mrun); // �±�
		th.start();
		
		int count = Thread.currentThread().activeCount();
		System.out.println(count);
	}

}
