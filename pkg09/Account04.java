package pkg09;

public class Account04 {
	static String bankname = "KB"; // �ŷ�ó
	String name; // ������
	int no; // ���¹�ȣ
	
	private int balance; // �ܾ��� �����
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int bal) {
		balance = bal;
	}
	
	public void Deposit(int bal) { // �Ա�
		balance += bal;
	}
	
	public void Withdraw(int bal) { // ����
		balance -= bal;
	}
		
	void Display() {
		System.out.println("�ŷ�ó : " + Account04.bankname);
		System.out.println("������ : " + name);
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�ܾ� : " + balance);
	}
	
}
