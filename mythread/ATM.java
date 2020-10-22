package mythread;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("최초 금액 : " + balance);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				int money = (int)(200 * Math.random());
				
				if (this.balance >= money && money != 0) {
					withdraw(money); // 인출
				} else {
					String imsi = Thread.currentThread().getName() + " ";
					imsi += money + "원 인출 실패";
					System.out.println(imsi);
					
					System.out.println("이유 : 잔액 부족");
					System.out.println("현재 잔액 : " + balance);
					System.out.println("인출 요구액 : " + money);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

	private synchronized void withdraw(int money) { // 임계 영역
		// 인출을 수행하는 메소드
		this.balance -= money;
		String imsi = Thread.currentThread().getName() + "가 ";
		imsi += money + "원을 인출하여 ";
		System.out.println(imsi);
		System.out.println("통장 잔액 : " + this.balance + "원 입니다.");
	}

}
