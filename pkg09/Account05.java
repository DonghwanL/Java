package pkg09;

public class Account05 {

	private String name; // 예금주
	private int no; // 계좌번호
	private int balance; // 잔액을 비공개

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int _no) {
		no = _no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int _balance) {
		balance += _balance;
	}

}
