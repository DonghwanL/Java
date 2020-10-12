package pkg10;

public class AccountMain07 {

	public static void main(String[] args) {
		Account07 soo = new Account07("김철수", 1234, 1000);
		soo.Display(); //4
		
		Account07 hee = new Account07("박영희", 5678, 2000);
		hee.Display(); // 8
		
		// 								이름 	   예치금
		// 계좌번호는 미입력시 9999로 지정해 보세요.
		Account07 kim = new Account07("김유신", 10000);
		kim.Display();
		
	}

}
