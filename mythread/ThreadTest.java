package mythread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadEx soo = new ThreadEx("Ã¶¼ö");
		soo.start();
		
		new ThreadEx("¿µÈñ").start(); // ÀÏÈ¸¿ë °´Ã¼ »ı¼º
		
		RunnableEx mrun = new RunnableEx();
		Thread th = new Thread(mrun); // ½Â±Ş
		th.start();
		
		int count = Thread.currentThread().activeCount();
		System.out.println(count);
	}

}
