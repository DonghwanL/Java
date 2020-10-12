package pkg09;

public class Account04 {
	static String bankname = "KB"; // 거래처
	String name; // 예금주
	int no; // 계좌번호
	
	private int balance; // 잔액을 비공개
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int bal) {
		balance = bal;
	}
	
	public void Deposit(int bal) { // 입금
		balance += bal;
	}
	
	public void Withdraw(int bal) { // 인출
		balance -= bal;
	}
		
	void Display() {
		System.out.println("거래처 : " + Account04.bankname);
		System.out.println("예금주 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("잔액 : " + balance);
	}
	
}
