package paytable;

public class PayMain {
	public static void main(String[] args) {
		PayTable[] pt = new PayTable[3];
		
		// 생성자의 매개 변수 : 이름, 기본급, 가족수, 시간 외 근무시간)
		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽", 800000, 1, 4);
		pt[2] = new PayTable("모팔모", 650000, 6, 2);

		MySalary.incentive = 0.7;
		
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc();
			pt[i].out();
			System.out.println("===================");
		}
		
	}
}