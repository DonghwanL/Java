package pkg03;

public class If01 {

	public static void main(String[] args) {
		int su = 10;

		if (su % 2 == 0) {
			System.out.println(su + "는 짝수");
			System.out.println("호호");
		} else {
			System.out.println(su + "는 홀수");
			System.out.println("하하");
		}

		su = 7;
		if (su % 3 == 0) {
			System.out.println(su + "는 3의 배수가 맞습니다.");
		}

		// x = 3, y = 5일때 두 수의 합이 3의 배수이거나 또는 5의 배수인지를 양자택일로 체크
		int x = 3;
		int y = 5;
		boolean bool = (x + y) % 3 == 0 || (x + y) % 5 == 0;

		if (bool == true) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		

	}

}
