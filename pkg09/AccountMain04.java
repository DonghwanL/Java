package pkg09;

public class AccountMain04 {

	public static void main(String[] args) {
		Account04 soo = new Account04();
		
		soo.name = "김철수";
		soo.no = 1234;
//		soo.balance = 1000;
		
		int money = 10000;
		
		soo.Deposit(money); // 입금하는 동작
		soo.Deposit(5000); // 입금하는 동작
		soo.Display();
		
		money = 3000;
		soo.Withdraw(money); // 인출하는 동작 
		soo.Display();
		
		System.out.println("잔액 : " + soo.getBalance());
		
		money = 12345;
		soo.setBalance(money);
		soo.Display();
	}

}
