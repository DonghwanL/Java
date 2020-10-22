package mythread;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("���� �ݾ� : " + balance);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				int money = (int)(200 * Math.random());
				
				if (this.balance >= money && money != 0) {
					withdraw(money); // ����
				} else {
					String imsi = Thread.currentThread().getName() + " ";
					imsi += money + "�� ���� ����";
					System.out.println(imsi);
					
					System.out.println("���� : �ܾ� ����");
					System.out.println("���� �ܾ� : " + balance);
					System.out.println("���� �䱸�� : " + money);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

	private synchronized void withdraw(int money) { // �Ӱ� ����
		// ������ �����ϴ� �޼ҵ�
		this.balance -= money;
		String imsi = Thread.currentThread().getName() + "�� ";
		imsi += money + "���� �����Ͽ� ";
		System.out.println(imsi);
		System.out.println("���� �ܾ� : " + this.balance + "�� �Դϴ�.");
	}

}
