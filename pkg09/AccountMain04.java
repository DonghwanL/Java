package pkg09;

public class AccountMain04 {

	public static void main(String[] args) {
		Account04 soo = new Account04();
		
		soo.name = "��ö��";
		soo.no = 1234;
//		soo.balance = 1000;
		
		int money = 10000;
		
		soo.Deposit(money); // �Ա��ϴ� ����
		soo.Deposit(5000); // �Ա��ϴ� ����
		soo.Display();
		
		money = 3000;
		soo.Withdraw(money); // �����ϴ� ���� 
		soo.Display();
		
		System.out.println("�ܾ� : " + soo.getBalance());
		
		money = 12345;
		soo.setBalance(money);
		soo.Display();
	}

}
