package pkg09;

public class AccountMain05 {

	public static void main(String[] args) {
		// 김철수에 대하여 Account05 클래스의 
		// getter, setter를 구현하는 프로그램을 작성하세요.
		
		Account05 soo = new Account05();
		
		soo.setName("김철수"); // 쓰기
		soo.setNo(1234);
		soo.setBalance(10000);
		
		System.out.println("예금주 : " + soo.getName());
		System.out.println("계좌 번호 : " + soo.getNo());
		System.out.println("예치금 : " + soo.getBalance());
		
	}

}
