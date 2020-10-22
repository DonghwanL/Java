package mythread;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int count = Thread.currentThread().activeCount();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("������ ���̵� : " + id);
		System.out.println("������ �̸� : " + name);
		System.out.println("�������� ������ ���� : " + count);
		System.out.println("������ �켱 ���� : " + priority);
		System.out.println("������ ���� : " + s);

	}

}
