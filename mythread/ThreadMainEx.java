package mythread;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int count = Thread.currentThread().activeCount();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("쓰레드 아이디 : " + id);
		System.out.println("쓰레드 이름 : " + name);
		System.out.println("동작중인 쓰레드 개수 : " + count);
		System.out.println("쓰레드 우선 순위 : " + priority);
		System.out.println("쓰레드 상태 : " + s);

	}

}
